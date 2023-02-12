package com.example.demo.controller;

import com.example.demo.dto.CartDto;
import com.example.demo.entity.Cart;
import com.example.demo.service.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cart")
public class CartController {
    private final CartService cartService;

    @PutMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody Cart cart){
        return ResponseEntity.ok(cartService.createCart(cart));
    }

    @GetMapping("/show")
    public ResponseEntity<List<CartDto>> show(){
        return ResponseEntity.ok(cartService.showList());
    }
    @GetMapping("/show-1-cart")
    public ResponseEntity<Cart> showCart(@RequestParam Long id){
        return ResponseEntity.ok(cartService.searchCartById(id));
    }
}
