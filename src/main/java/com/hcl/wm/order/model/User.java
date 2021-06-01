package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This represents the user details
 */
@Document
@Getter
@Setter
@ToString
public class User {
    private String userId;
    private String username;
    private String role; // "Restaurant", "Driver" , "Customer"
}
