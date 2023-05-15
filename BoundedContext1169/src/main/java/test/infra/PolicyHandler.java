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

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='VideoProcessed'"
    )
    public void wheneverVideoProcessed_NotifyToUser(
        @Payload VideoProcessed videoProcessed
    ) {
        VideoProcessed event = videoProcessed;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + videoProcessed + "\n\n"
        );
        // Sample Logic //

    }

    @StreamListener(
        value = KafkaProcessor.INPUT,
        condition = "headers['type']=='Fileupload'"
    )
    public void wheneverFileupload_NotifyToUser(
        @Payload Fileupload fileupload
    ) {
        Fileupload event = fileupload;
        System.out.println(
            "\n\n##### listener NotifyToUser : " + fileupload + "\n\n"
        );
        // Sample Logic //

    }
}
