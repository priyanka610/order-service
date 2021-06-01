package com.hcl.wm.order.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * This represents the driver details
 */
@Document
@Getter
@Setter
@ToString
public class Driver {
    private String driver_id;
    private String pickedUpStatus;
    private String deliveredStatus;
}
