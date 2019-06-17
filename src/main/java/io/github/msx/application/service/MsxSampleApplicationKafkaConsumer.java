package io.github.msx.application.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MsxSampleApplicationKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(MsxSampleApplicationKafkaConsumer.class);
    private static final String TOPIC = "topic_msxsampleapplication";

    @KafkaListener(topics = "topic_msxsampleapplication", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
