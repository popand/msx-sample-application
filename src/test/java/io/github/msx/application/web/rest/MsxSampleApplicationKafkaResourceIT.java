package io.github.msx.application.web.rest;

import io.github.msx.application.MsxSampleApplicationApp;
import io.github.msx.application.service.MsxSampleApplicationKafkaProducer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.kafka.test.context.EmbeddedKafka;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@EmbeddedKafka
@SpringBootTest(classes = MsxSampleApplicationApp.class)
public class MsxSampleApplicationKafkaResourceIT {

    @Autowired
    private MsxSampleApplicationKafkaProducer kafkaProducer;

    private MockMvc restMockMvc;

    @BeforeEach
    public void setup() {
        MsxSampleApplicationKafkaResource kafkaResource = new MsxSampleApplicationKafkaResource(kafkaProducer);

        this.restMockMvc = MockMvcBuilders.standaloneSetup(kafkaResource)
            .build();
    }

    @Test
    public void sendMessageToKafkaTopic() throws Exception {
        restMockMvc.perform(post("/api/msx-sample-application-kafka/publish?message=yolo"))
            .andExpect(status().isOk());
    }
}
