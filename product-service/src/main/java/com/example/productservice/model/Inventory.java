package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    private Long inventoryId;
    private Long productId;
    private Boolean inStock;
    
    public Inventory(long inventoryId, long productId, boolean inStock) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.inStock = inStock;
	}

	public Object getProductId() {
        return this.productId;
    }

    public boolean getInStock() {
        return false;
    }

}
