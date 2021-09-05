package com.example.productservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Price {
    private Long priceId;
    private Long productId;
    private Integer originalPrice;
    private Integer discountPrice;
    public Price(long priceId, long productId, int originalPrice, int discountPrice) {
        this.setPriceId(priceId);
        this.setProductId(productId);
        this.setOriginalPrice(originalPrice);
        this.setDiscountPrice(discountPrice);
    }
    public Long getPriceId() {
        return priceId;
    }
    public void setPriceId(Long priceId) {
        this.priceId = priceId;
    }
    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Integer getDiscountPrice() {
        return discountPrice;
    }
    public void setDiscountPrice(Integer discountPrice) {
        this.discountPrice = discountPrice;
    }
    public Integer getOriginalPrice() {
        return originalPrice;
    }
    public void setOriginalPrice(Integer originalPrice) {
        this.originalPrice = originalPrice;
    }
}
