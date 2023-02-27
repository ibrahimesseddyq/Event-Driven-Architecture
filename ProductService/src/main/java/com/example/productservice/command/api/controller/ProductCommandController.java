package com.example.productservice.command.api.controller;

import com.example.productservice.command.api.commands.CreateProductCommand;
import com.example.productservice.command.api.model.ProductRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/product")
public class ProductCommandController {
    private CommandGateway commandGateway;
    @PostMapping
    String addProduct(@RequestBody ProductRestModel productRestModel){
        CreateProductCommand productCommand= CreateProductCommand
                .builder()
                .productId(UUID.randomUUID().toString())
                .name(productRestModel.getName())
                .price(productRestModel.getPrice())
                .quantity(productRestModel.getQuantity())
                .build();
        return "Product added";
    }
}
