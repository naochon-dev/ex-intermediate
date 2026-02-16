package com.example.ex_intermediate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ex_intermediate.domain.Team;
import com.example.ex_intermediate.service.TeamService;



@Controller
@RequestMapping("/team")
public class TeamController {

    @Autowired
    private TeamService service;

    @RequestMapping("")
    public String index(Model model){        
        List<Team> teamList = service.findAll();
        model.addAttribute("teamList", teamList);
        return "baseball_team_list";
    }

    @RequestMapping("/detail")
    public String showDetail(Integer id, Model model){
        Team team = service.load(id);
        model.addAttribute("team",team);
        return "team_detail";
    }

}
