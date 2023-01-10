package mall.domain;

import mall.domain.*;
import mall.infra.AbstractEvent;
import java.util.*;
import lombok.*;


@Data
@ToString
public class StockIncrease extends AbstractEvent {

    private Long id;
    private String producnName;
    private String productImage;
    private String stock;

    public StockIncrease(Inventory aggregate){
        super(aggregate);
    }
    public StockIncrease(){
        super();
    }
}
