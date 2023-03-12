package com.example.demo.service;

import com.example.demo.entity.Panier;
import com.example.demo.entity.Product;
import com.example.demo.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class PanierService {
    @Autowired
    PanierRepository panierRepository;
    @Autowired
    ProductService productService;

    public ResponseEntity<?> addPanier(Panier panier){
        if (panier != null){
            panier.getProduct().forEach(product -> {
                if (productService.getProduct(product.getProductName())!= null) {
                    Set<Product> listProduct = new HashSet<>();
                    listProduct.add(productService.getProduct(product.getProductName()));
                    panier.setProduct(panier.getProduct());
                }
            });
            panierRepository.save(panier);
            return ResponseEntity.ok("Panier créé avec succes.");
        }else {
            return ResponseEntity.status(402).body("Panier vide.");
        }

    }

}
