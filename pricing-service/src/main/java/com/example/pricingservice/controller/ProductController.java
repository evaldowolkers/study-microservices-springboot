package com.example.pricingservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.pricingservice.model.Price;

@RestController
public class ProductController {

    List<Price> priceList = new ArrayList<Price>();

    @GetMapping("/price/{productId}")
    public Price getPriceDetails(@PathVariable Long productId) {
        System.out.println("Teste");

        Price price = getPriceInfo(productId);
        
        return price;

    }

    private Price getPriceInfo(Long productId) {
        populatePriceList();

        for(Price pi: priceList){
            if(productId.equals(pi.getProductId())){
                return pi;
            }
        }

        return null;
    }

    private void populatePriceList() {
        priceList.add(new Price(201L, 101L,1999,999));
        priceList.add(new Price(202L, 102L, 199, 19));
        priceList.add(new Price(203L, 103L, 1222, 60));
    }
    
}
