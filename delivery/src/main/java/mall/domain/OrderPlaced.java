package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
    private String cutomerId;
    private String productId;
    private String productName;
    private String status;
    private Integer qty;
    private String address;
}


