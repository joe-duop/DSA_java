package com.joe.generics;

import java.util.ArrayList;
import java.util.List;


public class Team<T extends Player> {
    private String name;
    private List<T> members = new ArrayList<T>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getMembers() {
        return members;
    }

    public void setMembers(List<T> members) {
        this.members = members;
    }

    public void addPlayer(T player){
        members.add(player);
    }
}
