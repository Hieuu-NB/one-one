package com.example.demo.service;

import com.example.demo.dto.CartDto;
import com.example.demo.dto.ResultDto;
import com.example.demo.entity.Cart;
import com.example.demo.entity.Item;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.ItemsRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CartServiceImpl implements CartService{
    private final CartRepository cartRepository;
    private final ItemsRepository itemsRepository;
    private final ModelMapper mapper;

//    {
//        "nameCart": "cart 1",
//            "items":[
//        {
//            "nameItem": "milk",
//                "cost":"20000"
//        },
//        {
//            "nameItem": "vegetable",
//                "cost":"10000"
//        }
//    ]
//    }
    // dữ liệu test
    @Override
    public ResultDto createCart(Cart cart) {
        try {
            cartRepository.save(cart);
        }catch (Exception e){
            return ResultDto.builder().code(400).message(e.getMessage()).build();
        }
        return ResultDto.builder().code(200).message("thanh cong").build();
    }

    @Override
    public List<CartDto> showList() {
        List<Cart> carts = cartRepository.findAll();
        List<CartDto> cartDtos = new ArrayList<>();
        for (Cart i : carts){
            CartDto x = mapper.map(i,CartDto.class);
            cartDtos.add(x);
        }
        return cartDtos;
    }

    @Override
    public Cart searchCartById(Long id) {
        return cartRepository.findCartById(id);
    }
}
