package test.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import test.domain.*;

@RepositoryRestResource(collectionResourceRel = "videos", path = "videos")
public interface VideoRepository
    extends PagingAndSortingRepository<Video, Long> {}
