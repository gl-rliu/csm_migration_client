package com.confluent.services;

import io.confluent.kafka.schemaregistry.client.CachedSchemaRegistryClient;
import io.confluent.kafka.schemaregistry.client.SchemaRegistryClient;
import lombok.extern.slf4j.Slf4j;
import org.apache.avro.Schema;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class SchemaRegistryService {

    private final SchemaRegistryClient schemaRegistryClient;

    private Schema schema;

    public SchemaRegistryService(
            @Value("${spring.kafka.properties.schema.registry.url}") String schemaRegistryUrl,
            @Value("${spring.kafka.properties.basic.auth.user.info}") String basicAuthCredentials) {

        Map<String, String> configs = new HashMap<>();
        configs.put("schema.registry.url", schemaRegistryUrl);
        configs.put("basic.auth.credentials.source", "USER_INFO");
        configs.put("schema.registry.basic.auth.user.info", basicAuthCredentials);

        this.schemaRegistryClient = new CachedSchemaRegistryClient(schemaRegistryUrl, 100, configs);
    }

    public Schema getSchema(String topicName) {
        if (schema == null) {
            try {
                String subject = topicName + "-value";  // Schema registry subject, typically "<topic-name>-value"
                schema = new Schema.Parser().parse(schemaRegistryClient.getLatestSchemaMetadata(subject).getSchema());

                //log.info("Received schema from registry : " + schema.toString());

            } catch (Exception e) {
                throw new RuntimeException("Failed to retrieve schema from registry", e);
            }
        }
        return schema;
    }
}