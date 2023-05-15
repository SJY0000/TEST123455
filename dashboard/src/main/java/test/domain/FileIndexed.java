package test.domain;

import java.util.*;
import lombok.Data;
import test.infra.AbstractEvent;

@Data
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private List<String> keywords;
}
