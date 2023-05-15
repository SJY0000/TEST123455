package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.VideoprocessingApplication;
import test.domain.VideoProcessed;

@Entity
@Table(name = "Video_table")
@Data
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    private String url;

    @PostPersist
    public void onPostPersist() {
        VideoProcessed videoProcessed = new VideoProcessed(this);
        videoProcessed.publishAfterCommit();
    }

    public static VideoRepository repository() {
        VideoRepository videoRepository = VideoprocessingApplication.applicationContext.getBean(
            VideoRepository.class
        );
        return videoRepository;
    }

    public static void processVideo(Fileupload fileupload) {
        /** Example 1:  new item 
        Video video = new Video();
        repository().save(video);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileupload.get???()).ifPresent(video->{
            
            video // do something
            repository().save(video);


         });
        */

    }
}
