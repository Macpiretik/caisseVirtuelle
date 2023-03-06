package com.example.demo.service;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductMapper productMapper;

    /**
     * @return
     */
    public List<ProductDto> allProduct() {
        List<ProductDto> listProductDto = new ArrayList<>();
        productRepository.findAll().stream()
                .forEach(p -> {
                    listProductDto.add(productMapper.mapProductToProductDto(p));
                });
        if (listProductDto.isEmpty()) {
            throw new RuntimeException("Liste vide");
        }
        return listProductDto;
    }

    /**
     * @param product
     */
    public String addProduct(Product product) {

        if (isExist(product.getProductName()) != null) {

            product.setProductQuantity(product.getProductQuantity() + 1);


            return "Quantité modifiée.";

        }
        product.setProductDate(LocalDate.now());
        if (product.getProductQuantity() < 1) {
            product.setProductQuantity(1);
        }
        productRepository.save(product);
        return "Produit ajouté";
    }

    private String isExist(String productName) {

        return productRepository.findByName(productName) == null ? null : productRepository.findByName(productName);
    }
}

