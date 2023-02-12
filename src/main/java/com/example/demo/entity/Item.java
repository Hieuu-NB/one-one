package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Entity
@Setter
@Getter
@Table(name = "item")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    private String nameItem;
    private String cost;
    @ManyToOne
    @JoinColumn(name = "cart_id" ,nullable = false,referencedColumnName = "id") // cột cart_id góống cột cartId bên cart
    @JsonBackReference
    private Cart cart;


}
