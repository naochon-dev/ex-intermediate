package com.example.ex_intermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ex_intermediate.domain.Hotel;
import com.example.ex_intermediate.repository.SearchHotelRepository;

@Service
@Transactional
public class SeachHotelService {

    @Autowired
    private SearchHotelRepository repository;

    public List<Hotel> searchRecord(Integer borderPrice){
        return repository.searchRecord(borderPrice); 
    }

    public List<Hotel> searchAll(){
        return repository.searchAll();
    }

}
