package com.hcl.wm.order.dto;

import com.hcl.wm.order.model.Customer;
import com.hcl.wm.order.model.Driver;
import com.hcl.wm.order.model.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

/**
 * This represents the order details
 */
@Component
@Getter
@Setter
@ToString
public class OrderDto {

    private String id;
    private Item item;
    private int qty;
    private Customer customer;
    private Driver driver;
    private String invoice;
}
