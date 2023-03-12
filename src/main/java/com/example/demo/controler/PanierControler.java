package com.example.demo.controler;

import com.example.demo.entity.Panier;
import com.example.demo.service.PanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/panier")

public class PanierControler {
    @Autowired
    PanierService panierService;

    @PostMapping(value = "/addPanier")
    public ResponseEntity<?> addPanier(@RequestBody Panier panier){
        return panierService.addPanier(panier);
    }

}
