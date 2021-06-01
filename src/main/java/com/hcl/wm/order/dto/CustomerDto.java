package com.hcl.wm.order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;


/**
 * This represents the customer details
 */
@Component
@Getter
@Setter
@ToString
public class CustomerDto {
    private String cust_id;
    private String first_name;
    private String last_name;
}
