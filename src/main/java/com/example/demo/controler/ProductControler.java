package com.example.demo.controler;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value ="/product")
public class ProductControler {
    @Autowired
    ProductService productService;

    @GetMapping(value = "/allProduct")
    public List<ProductDto> getAllProduct (){
        return productService.allProduct();
    }
    @PostMapping(value = "/addProduct")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);

    /*@PostMapping(value = "/updateProduct")
    public String updateProduct(@RequestBody Product product)
*/
    }

}
