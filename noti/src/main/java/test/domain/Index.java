package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.NotiApplication;
import test.domain.FileIndexed;

@Entity
@Table(name = "Index_table")
@Data
public class Index {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Long fileId;

    @ElementCollection
    private List<String> keywords;

    @PostPersist
    public void onPostPersist() {
        FileIndexed fileIndexed = new FileIndexed(this);
        fileIndexed.publishAfterCommit();
    }

    public static IndexRepository repository() {
        IndexRepository indexRepository = NotiApplication.applicationContext.getBean(
            IndexRepository.class
        );
        return indexRepository;
    }

    public static void index(Fileupload fileupload) {
        /** Example 1:  new item 
        Index index = new Index();
        repository().save(index);

        */

        /** Example 2:  finding and process
        
        repository().findById(fileupload.get???()).ifPresent(index->{
            
            index // do something
            repository().save(index);


         });
        */

    }
}
