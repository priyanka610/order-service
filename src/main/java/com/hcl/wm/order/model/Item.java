package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * This represents the item details
 */
@Document
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Item {
    private String item_id;
    private String rate;
    private String available_qty;
    private String item_name;
    private String restaurant_id;
    private String unit_Prep_time;

    public Item(String item_id, String rate, String available_qty, String item_name, String restaurant_id, String unit_Prep_time) {
        this.item_id = item_id;
        this.rate = rate;
        this.available_qty = available_qty;
        this.item_name = item_name;
        this.restaurant_id = restaurant_id;
        this.unit_Prep_time = unit_Prep_time;
    }
}
