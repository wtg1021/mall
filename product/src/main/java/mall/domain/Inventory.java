package mall.domain;

import mall.domain.StockDecrease;
import mall.domain.StockIncrease;
import mall.ProductApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private String producnName;
    
    
    
    
    
    private String productImage;
    
    
    
    
    
    private String stock;

    @PostPersist
    public void onPostPersist(){


        StockDecrease stockDecrease = new StockDecrease(this);
        stockDecrease.publishAfterCommit();



        StockIncrease stockIncrease = new StockIncrease(this);
        stockIncrease.publishAfterCommit();

    }

    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = ProductApplication.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }




    public static void decreaseStock(DeliveryCompleted deliveryCompleted){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryCompleted.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }
    public static void increaseStock(DeliveryReturned deliveryReturned){

        /** Example 1:  new item 
        Inventory inventory = new Inventory();
        repository().save(inventory);

        */

        /** Example 2:  finding and process
        
        repository().findById(deliveryReturned.get???()).ifPresent(inventory->{
            
            inventory // do something
            repository().save(inventory);


         });
        */

        
    }


}
