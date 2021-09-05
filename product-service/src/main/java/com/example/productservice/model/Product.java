package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private Long productId;
    private String productName;
    private String productDesc;
    private Integer productPrice;
    private Boolean productStock;
    
    public Product(Long productId, String productName, String productDesc, int productPrice, boolean productStock) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productPrice = productPrice;
        this.productStock = productStock;
    }

    public Long getProductId() {
        return productId;
    }
    public Boolean getProductStock() {
        return productStock;
    }
    public void setProductStock(Boolean productStock) {
        this.productStock = productStock;
    }
    public Integer getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(Integer productPrice) {
        this.productPrice = productPrice;
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
