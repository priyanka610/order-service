package com.hcl.wm.order.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * This represents the product resource to be send to kafka
 */
@RestController
@RequestMapping("/kafka")
public class ProductController {

   /* private static final String TOPIC = "KAFKA EXAMPLE";
    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping("/publish/{message}")
    String publish(@PathVariable String message) {
        template.send(TOPIC, message);
        return "published successfully";
    }*/
}
