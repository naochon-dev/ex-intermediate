package com.example.ex_intermediate.domain;

public class Team {

    private Integer id;
    private String leagueName;
    private String teamName;
    private String headquaters;
    private String inauguration;
    private String history;

    @Override
    public String toString() {
        return "Team [id=" + id + ", leagueName=" + leagueName + ", teamName=" + teamName + ", headquaters="
                + headquaters + ", inauguration=" + inauguration + ", history=" + history + "]";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getHeadquaters() {
        return headquaters;
    }

    public void setHeadquaters(String headquaters) {
        this.headquaters = headquaters;
    }

    public String getInauguration() {
        return inauguration;
    }

    public void setInauguration(String inauguration) {
        this.inauguration = inauguration;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    
}
