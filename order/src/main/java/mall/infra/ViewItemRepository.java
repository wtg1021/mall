package mall.infra;

import mall.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.List;

@RepositoryRestResource(collectionResourceRel="viewItems", path="viewItems")
public interface ViewItemRepository extends PagingAndSortingRepository<ViewItem, Long> {

    

    
}
