package com.example.demo.service;

import com.example.demo.dto.ResultDto;
import com.example.demo.entity.Item;
import com.example.demo.repository.ItemsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemsServiceImpl implements ItemsService {
    private final ItemsRepository itemsRepository;
    @Override
    public ResultDto createItems(Item item) {
        try {
            itemsRepository.save(item);
        }catch (Exception e){
            return ResultDto.builder().code(400).message(e.getMessage()).build();
        }
        return ResultDto.builder().code(200).message("thanh cong").build();
    }
}





















