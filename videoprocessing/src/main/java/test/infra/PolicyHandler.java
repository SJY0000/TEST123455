package test.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import test.config.kafka.KafkaProcessor;
import test.domain.*;

@Service
@Transactional
public class PolicyHandler {

    @Autowired
    VideoRepository videoRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Fileupload'"
    )
    public void wheneverFileupload_ProcessVideo(
        @Payload Fileupload fileupload
    ) {
        Fileupload event = fileupload;
        System.out.println(
            "\n\n##### listener ProcessVideo : " + fileupload + "\n\n"
        );

        // Sample Logic //
        Video.processVideo(event);
    }
}
