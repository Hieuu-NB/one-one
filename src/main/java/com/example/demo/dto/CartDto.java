package com.example.demo.dto;

import com.example.demo.entity.Item;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
@Data
public class CartDto {
    @JsonProperty("nameCart")
    private String nameCart;
    @JsonProperty("items")
    private List<Item> items;
}
