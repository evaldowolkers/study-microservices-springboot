package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductInfo {
    private Long productId;
    private String productName;
    private String productDesc;

    public ProductInfo(long l, String string, String string2) {
    }
    public Long getProductId() {
        return productId;
    }
    public String getProductDesc() {
        return productDesc;
    }
    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    
}
