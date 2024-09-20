package com.confluent.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaAvroConsumer {

    Logger log = LoggerFactory.getLogger(KafkaAvroConsumer.class);

    @KafkaListener(id = "avroConsumer", topics = "ET1-BM1-ET8", groupId = "springboot-group-1", autoStartup = "true")
    public void read(ConsumerRecord<String, GenericRecord> consumerRecord) {
        String key = consumerRecord.key();
        GenericRecord event = consumerRecord.value();

        log.info("Avro message received for key : " + key + " value : " + event.toString() + "schema: " + event.getSchema());

    }
}
