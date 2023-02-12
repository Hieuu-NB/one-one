package com.example.demo.service;

import com.example.demo.dto.CartDto;
import com.example.demo.dto.ResultDto;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Item;

import java.util.List;

public interface CartService {
    ResultDto createCart(Cart cart);
    List<CartDto> showList();
    Cart searchCartById(Long id);
}
