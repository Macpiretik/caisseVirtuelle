package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "t_panier")
@Data
public class Panier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long panierId;
    @OneToMany(mappedBy = "productId")
    Set<Product> product;
}
