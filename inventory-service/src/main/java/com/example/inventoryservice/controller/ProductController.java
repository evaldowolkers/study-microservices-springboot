package com.example.inventoryservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.inventoryservice.model.Inventory;

@RestController
public class ProductController {

    List<Inventory> inventoryList = new ArrayList<Inventory>();

    @GetMapping("/inventory/{productId}")
    public Inventory getInventoryDetails(@PathVariable Long productId) {

        Inventory inventory = getInventoryInfo(productId);
        
        return inventory;

    }

    private Inventory getInventoryInfo(Long productId) {
        populateInventoryList();

        for(Inventory i: inventoryList){
            if(productId.equals(i.getProductId())){
                return i;
            }
        }

        return null;
    }

    private void populateInventoryList() {
        inventoryList.add(new Inventory(301L, 101L, true));
        inventoryList.add(new Inventory(302L, 102L, true));
        inventoryList.add(new Inventory(303L, 103L, false));
    }
    
}
