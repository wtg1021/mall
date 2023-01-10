package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class DeliveryStated extends AbstractEvent {

    private Long id;
    private Long orderId;
    private String productId;
    private String address;
    private String status;

    public DeliveryStated(Delivery aggregate){
        super(aggregate);
    }
    public DeliveryStated(){
        super();
    }
}
