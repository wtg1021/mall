package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long id;
    private String cutomerId;
    private String productId;
    private String productName;
    private String status;
    private Integer qty;
    private String address;

    public OrderCanceled(Order aggregate){
        super(aggregate);
    }
    public OrderCanceled(){
        super();
    }
}
