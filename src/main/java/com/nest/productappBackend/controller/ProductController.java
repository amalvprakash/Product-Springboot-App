package com.nest.productappBackend.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProductController {

    @PostMapping("/")
    public String Home(){
        return "Welcome to Home Page";
    }

    @PostMapping("/addProducts")
    public String AddProduct(){
        return "Add products";
    }

    @PostMapping("/searchProducts")
    public String searchProducts(){
        return "search products";
    }

    @PostMapping("/deleteProducts")
    public String deleteProducts(){
        return "delete products";
    }

    @GetMapping("/viewProducts")
    public String viewall(){
        return "viewall products";
    }

}
