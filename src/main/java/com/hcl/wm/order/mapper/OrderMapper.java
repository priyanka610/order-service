package com.hcl.wm.order.mapper;

import com.hcl.wm.order.dto.OrderDto;
import com.hcl.wm.order.model.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * This represents the order mapper
 */
@Component
public class OrderMapper {

    public static OrderDto toDto(Order entity) {
        OrderDto dto = new OrderDto();
        dto.setCustomer(entity.getCustomer());
        dto.setId(entity.getId());
        dto.setDriver(entity.getDriver());
        dto.setItem(entity.getItem());
        dto.setQty(entity.getQty());
        dto.setInvoice(entity.getInvoice());
        return dto;
    }

    public static List<OrderDto> toDtoList(List<Order> order) {
        List<OrderDto> dtoList = new ArrayList<>();
        for (Order order1 : order
        ) {
            dtoList.add(toDto(order1));
        }
        return dtoList;
    }
}
