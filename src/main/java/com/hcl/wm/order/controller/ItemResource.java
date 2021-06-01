package com.hcl.wm.order.controller;

import com.hcl.wm.order.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This represents the item resource to send ITEM TOPIC to kafka
 */
@RestController
@RequestMapping("/kafka/item")
public class ItemResource {
/*
    private static final String TOPIC = "KAFKA EXAMPLE";
    @Autowired
    private KafkaTemplate<String, Item> template;

    @GetMapping("/publish/{id}")
    String publish(@PathVariable String id) {
        template.send(TOPIC, new Item(id,"40","50","Maggie","12345","1"));
        return "published successfully";
    }*/

}
