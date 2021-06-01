package com.hcl.wm.order.service;

import com.hcl.wm.order.model.Customer;
import org.bson.types.ObjectId;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * This represents the customer service
 */
@Service
public class CustomerService {
    private static final String URL = "http://localhost:9092/customer/60af80fcdd50ed5e94cff244";
    private static final String URL1 = "http://localhost:9092/customer/findAll";
    Logger logger = LoggerFactory.getLogger(CustomerService.class);

    //@Autowired
    RestTemplate restTemplate = new RestTemplate();

    public Customer findById(ObjectId id) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<Object> entity = new HttpEntity<>(headers);
        ResponseEntity<Customer> responseEntity = null;
        try {
            responseEntity = restTemplate.exchange(URL,
                    HttpMethod.GET,
                    entity,
                    Customer.class);
        } catch (Exception ex) {
            logger.error("Error caught while calling customer service" + ex);
        }
        Customer customer = new Customer();
        if(responseEntity!=null) {
            HttpStatus status = responseEntity.getStatusCode();
            System.out.println(status);
            customer.setCust_Id(responseEntity.getBody().getCust_Id());
            customer.setFirstName(responseEntity.getBody().getFirstName());
            customer.setLastName(responseEntity.getBody().getLastName());
            customer.setAddress(responseEntity.getBody().getAddress());
            System.out.println(customer);
        }
        return customer;
    }
}
