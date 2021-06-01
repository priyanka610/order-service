package com.hcl.wm.order.security;

import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfiguration {
/*
    @Bean
    ProducerFactory producerfactory() {
        Map<String, Object> config = new HashMap<>();
        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9090");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
        return new DefaultKafkaProducerFactory(config);
    }

    @Bean
    KafkaTemplate<String, Item> kafkaTemplate() {
        return new KafkaTemplate<>(producerfactory());
    }*/

}
