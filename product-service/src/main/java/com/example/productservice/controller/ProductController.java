package com.example.productservice.controller;

import java.util.ArrayList;
import java.util.List;

import com.example.productservice.model.Product;
import com.example.productservice.model.Price;
import com.example.productservice.model.Inventory;
import com.example.productservice.model.ProductInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

    List<ProductInfo> productList = new ArrayList<ProductInfo>();

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/product/details/{productId}")
    public Product getProductDetails(@PathVariable Long productId) {

        ProductInfo productInfo = getProductInfo(productId);

        Price price = restTemplate.getForObject("http://localhost:8002/price/" + productId, Price.class);

        Inventory inventory = restTemplate.getForObject("http://localhost:8003/inventory/" + productId, Inventory.class);
        
        return new Product(productInfo.getProductId(), productInfo.getProductName(), productInfo.getProductDesc(), price.getDiscountPrice(), inventory.getInStock());

    }

    private ProductInfo getProductInfo(Long productId) {
        populateProductList();

        for(ProductInfo pi: productList){
            if(productId.equals(pi.getProductId()));
        }


        return null;
    }

    private void populateProductList() {
        productList.add(new ProductInfo(101L,"iPhone", "Muito caro"));
        productList.add(new ProductInfo(102L,"Livro", "Livro é legal"));
        productList.add(new ProductInfo(103L,"Lavadora", "De lei, rs"));
    }
    
}
