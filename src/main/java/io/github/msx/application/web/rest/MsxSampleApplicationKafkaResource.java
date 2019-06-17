package io.github.msx.application.web.rest;

import io.github.msx.application.service.MsxSampleApplicationKafkaProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/msx-sample-application-kafka")
public class MsxSampleApplicationKafkaResource {

    private final Logger log = LoggerFactory.getLogger(MsxSampleApplicationKafkaResource.class);

    private MsxSampleApplicationKafkaProducer kafkaProducer;

    public MsxSampleApplicationKafkaResource(MsxSampleApplicationKafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    @PostMapping(value = "/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message) {
        log.debug("REST request to send to Kafka topic the message : {}", message);
        this.kafkaProducer.sendMessage(message);
    }
}
