package com.example.ex_intermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ex_intermediate.domain.Hotel;
import com.example.ex_intermediate.repository.SearchHotelRepository;

/**
 * @author NaoIwakawa
 */
@Service
@Transactional
public class SeachHotelService {

    @Autowired
    private SearchHotelRepository repository;

    /**
     * 上限金額以下のホテルを検索する.
     * @param borderPrice 上限金額
     * @return 上限金額以下のホテル一覧
     */
    public List<Hotel> searchRecord(Integer borderPrice){
        return repository.searchRecord(borderPrice); 
    }

    /**
     * 全てのホテルを検索する.
     * @return ホテル一覧
     */
    public List<Hotel> searchAll(){
        return repository.searchAll();
    }

}
