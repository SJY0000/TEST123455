package test.domain;

import java.util.*;
import lombok.Data;
import test.infra.AbstractEvent;

@Data
public class Fileupload extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdTime;
    private String type;
    private String userid;
}
