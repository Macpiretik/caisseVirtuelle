package com.example.demo.mapper;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {
    public ProductDto mapProductToProductDto(Product product){
        ProductDto productDto = new ProductDto();
        productDto.setProductName(product.getProductName());
        productDto.setProductId((int) product.getProductId());
        productDto.setProductQuantity(product.getProductQuantity());

        return productDto;

    }

}
