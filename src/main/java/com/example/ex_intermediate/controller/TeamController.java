package com.example.ex_intermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex_intermediate.domain.Team;
import com.example.ex_intermediate.service.TeamService;



@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService service;

    @RequestMapping("")
    public String index(){        
        List<Team> teamList = service.findAll();
        return "baseball_team_list";
    }

    @RequestMapping("/detail")
    public String showDetail(){
        Team team = service.load(1);
        return "team_detail";
    }

}
