package com.example.pricingservice.model;

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
        this.priceId = priceId;
        this.productId = productId;
        this.originalPrice = originalPrice;
        this.discountPrice = discountPrice;
    }
    public Object getProductId() {
        return null;
    }    
}
