package app.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaSender {


    //KafkaTemplate it some wrapper which wrapps Producer in this case our Sender
    // and provides convenience methods (send, flush, execute) for sending messages to kafkaTopic
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    // new created topic
    String kafkaTopic = "java_in_use_topic";

    public void send(String message) {

        kafkaTemplate.send(kafkaTopic, message);
    }
}
