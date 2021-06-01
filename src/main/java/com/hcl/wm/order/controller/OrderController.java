package com.hcl.wm.order.controller;

import com.hcl.wm.order.dto.OrderDto;
import com.hcl.wm.order.mapper.OrderMapper;
import com.hcl.wm.order.model.Customer;
import com.hcl.wm.order.service.CustomerService;
import com.hcl.wm.order.service.OrderService;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * This represents the order resource
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderService service;

    @Autowired
    private CustomerService customerService;

    @Autowired
    private OrderMapper mapper;

    @GetMapping("/getOrderList")
    List<OrderDto> getOrders() {
        logger.info("Getting order list....");
        return mapper.toDtoList(service.getOrders());
    }

    @GetMapping("/getInvoice/{orderId}")
    String getInvoice(String orderId) {
        logger.info("Getting invoice details for order Id: " + orderId);
        return service.getInvoice(orderId);
    }

    /**
     * Getting customer details using rest template using customerId
     */
    @GetMapping("/getCustomer/{customerId}")
    Customer getCustomerDetails(ObjectId customerId) {
        logger.info("Getting invoice details for order Id: " + customerId);
        return customerService.findById(customerId);
    }
}
