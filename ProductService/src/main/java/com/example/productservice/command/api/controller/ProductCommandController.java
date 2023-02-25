package com.example.productservice.command.api.controller;

import com.example.productservice.command.api.model.ProductRestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductCommandController {
    @PostMapping
    String addProduct(@RequestBody ProductRestModel productRestModel){
        return "Product added";
    }
}
