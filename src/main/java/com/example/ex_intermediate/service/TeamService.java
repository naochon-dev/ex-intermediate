package com.example.ex_intermediate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.ex_intermediate.domain.Team;
import com.example.ex_intermediate.repository.TeamRepository;

@Service
@Transactional
public class TeamService {

    @Autowired
    private TeamRepository repository;

    
    public Team load(Integer id){
        return repository.load(id);
    }

    public List<Team> findAll(){
        return repository.findAll();
    }

}
