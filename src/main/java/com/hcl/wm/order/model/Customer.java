package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * This represents the customer mapper
 */
@Getter
@Setter
@ToString
public class Customer {
    private String cust_Id;
    private String firstName;
    private String lastName;
    private String address;
}
