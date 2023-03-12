package com.example.demo.dto;

import com.example.demo.entity.Panier;
import lombok.Data;

import javax.persistence.Id;
@Data
public class ProductDto {

    int productId;
    String productName;
    int productQuantity ;
    Long panierId;

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", panier=" + panierId +
                '}';
    }









}
/*
package com.example.demo.dto;

import javax.persistence.Id;

public class ProductDto {
    @Override
    public String toString() {
        return "ProductDto{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }

    int productId;
    String productName;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


}

 */