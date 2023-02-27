package com.example.productservice.command.api.aggregate;

import com.example.productservice.command.api.commands.CreateProductCommand;
import com.example.productservice.command.api.events.ProductCreateEvent;
import com.fasterxml.jackson.databind.util.BeanUtil;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

public class ProductAggregate {
    @AggregateIdentifier
    private String productId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
    ProductAggregate(){

    }
    ProductAggregate(CreateProductCommand createProductCommand){
        ProductCreateEvent productCreateEvent = new ProductCreateEvent();
        BeanUtils.copyProperties(createProductCommand,productCreateEvent);

    }
}
