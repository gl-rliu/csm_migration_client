package com.confluent.consumer;

import com.confluent.dto.Employee;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.avro.generic.GenericRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaAvroConsumer {

    @KafkaListener(id = "avroConsumer", topics = "ET1-BM1-ET8", groupId = "springboot-group-1", autoStartup = "true")
    public void read(ConsumerRecord<String, GenericRecord> consumerRecord) {
        String key = consumerRecord.key();
        GenericRecord event = consumerRecord.value();
        //log.info("Avro message received for key : " + key + " value : " + event.toString());

    }
}
