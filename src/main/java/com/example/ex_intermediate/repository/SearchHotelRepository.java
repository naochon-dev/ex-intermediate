package com.example.ex_intermediate.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.ex_intermediate.domain.Hotel;

/**
 * @author NaoIwakawa
 */
@Repository
public class SearchHotelRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    private static final RowMapper<Hotel> HOTEL_ROW_MAPPER
        =(rs,i) -> {
            Hotel hotel = new Hotel();
            hotel.setId(rs.getInt("id"));
            hotel.setAreaName(rs.getString("area_name"));
            hotel.setHotelName(rs.getString("hotel_name"));
            hotel.setAddress(rs.getString("address"));
            hotel.setNearestStation(rs.getString("nearest_station"));
            hotel.setPrice(rs.getInt("price"));
            hotel.setParking(rs.getString("parking"));
            return hotel;
        };

    /**
     * 上限金額以下のホテルを検索する.
     * @param borderPrice 上限金額
     * @return 上限金額以下のホテル一覧
     */
    public List<Hotel> searchRecord(Integer borderPrice){
        String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels WHERE price <= :border_price ORDER BY price";
        SqlParameterSource param = new MapSqlParameterSource().addValue("border_price", borderPrice);
        List<Hotel> hotelList = template.query(sql, param, HOTEL_ROW_MAPPER);
        return hotelList;
    }

    /**
     * 全てのホテルを検索する.
     * @return ホテル一覧
     */
    public List<Hotel> searchAll(){
        String sql = "SELECT id,area_name,hotel_name,address,nearest_station,price,parking FROM hotels ORDER BY price";
        List<Hotel> hotelList = template.query(sql, HOTEL_ROW_MAPPER);
        return hotelList;
    }

}
