package com.hcl.wm.order.service;

import com.hcl.wm.order.model.Customer;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class CustomerServiceTest {

    @Test
    void findById() {
        CustomerService service = new CustomerService();
        Customer customer = service.findById(new ObjectId("60af80fcdd50ed5e94cff244"));
        assertNotNull(customer);
       /* assertNotNull(customer.getAddress());
        assertNotNull(customer.getCust_Id());
        assertNotNull(customer.getFirstName());*/
    }
}