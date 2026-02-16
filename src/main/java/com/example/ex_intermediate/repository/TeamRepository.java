package com.example.ex_intermediate.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ex_intermediate.domain.Team;

@Repository
public class TeamRepository {

    @Autowired
    private NamedParameterJdbcTemplate template;

    public Team load(Integer id){
        System.out.println("Repositoryのload()が呼ばれました");
        return null;
    }

    public List<Team> findAll(){
        System.out.println("RepositoryのfindAll()が呼ばれました");
        return new ArrayList<Team>();
    }

}
