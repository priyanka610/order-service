package com.hcl.wm.order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;


/**
 * This represents the item details
 */
@Component
@Getter
@Setter
@ToString
public class ItemDto {
    private String item_id;
    private String rate;
    private String available_qty;
    private String item_name;
}
