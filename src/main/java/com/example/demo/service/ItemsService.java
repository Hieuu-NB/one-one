package com.example.demo.service;

import com.example.demo.dto.ResultDto;
import com.example.demo.entity.Item;

public interface ItemsService {
    ResultDto createItems(Item items);
}

