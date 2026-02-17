package com.example.ex_intermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex_intermediate.domain.Hotel;
import com.example.ex_intermediate.service.SeachHotelService;

/**
 * @author NaoIwakawa
 */
@Controller
@RequestMapping("/searchHotel")
public class SearchHotelController {

    @Autowired
    private SeachHotelService service;

    /**
     * 検索フォーム画面を表示する.
     * @return 検索フォーム画面のテンプレート
     */
    @GetMapping("")
    public String index(){
        return "search_hotel";
    }

    /**
     * 検索フォーム画面下部に検索結果を表示する.
     * @param borderPrice 上限金額
     * @param model requestスコープ用オブジェクト
     * @return 検索フォーム画面のテンプレート
     */
    @PostMapping("/showResult")
    public String showResult(Integer borderPrice, Model model){
        List<Hotel> hotelList;
        if (borderPrice==null) {
            hotelList = service.searchAll();
        }else{
            hotelList = service.searchRecord(borderPrice);
        }        
        model.addAttribute("hotelList", hotelList);
        return "search_hotel";
    }
}
