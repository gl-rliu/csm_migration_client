package com.confluent.producer;

import com.confluent.consumer.KafkaAvroConsumer;
import com.confluent.dto.Event;
import com.confluent.services.SchemaRegistryService;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

@Service
@Slf4j
public class KafkaAvroProducer {

    private final KafkaTemplate<String, GenericRecord> template;
    private final Schema schema;
    private final SchemaRegistryService schemaRegistryService;

    Logger log = LoggerFactory.getLogger(KafkaAvroProducer.class);

    @Value("${topic.name}")
    private String topicName;


    @Autowired
    public KafkaAvroProducer(KafkaTemplate<String, GenericRecord> template,
                             SchemaRegistryService schemaRegistryService,
                             @Value("${topic.name}") String topicName) {
        this.template = template;
        this.schemaRegistryService = schemaRegistryService;
        this.topicName = topicName;
        this.schema = schemaRegistryService.getSchema(topicName);  // Now topicName is properly injected
    }

    public void send(Event event) {
        try {
            // Create a generic record from the Event object
            GenericData.Record avroRecord = new GenericData.Record(schema);
            avroRecord.put("accountNumber", event.getAccountNumber());
            avroRecord.put("paymentId", event.getPaymentId());
            avroRecord.put("eventTime", event.getEventTime());
            //System.out.println("sending...." + schema.toString() + " " + avroRecord.toString());
            log.info("Serialized the record using schema " + schema.toString() +" -> " + avroRecord.toString());

            CompletableFuture<SendResult<String, GenericRecord>> future = template.send(topicName,
                    UUID.randomUUID().toString(),
                    avroRecord);
            future.whenComplete((result, ex) -> {
                if (ex == null) {
                    System.out.println("Sent message=[" + event +
                            "] with offset=[" + result.getRecordMetadata().offset() + "]");
                } else {
                    System.out.println("Unable to send message=[" +
                            event + "] due to : " + ex.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}