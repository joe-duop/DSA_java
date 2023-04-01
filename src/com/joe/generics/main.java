package com.joe.generics;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        System.out.println("generics");
        Team<SoccerPlayer> sanandiki = new Team<>("sanandiki");
        Team<VolleyPlayer> chwele = new Team<>("chwele");

//        soccer players
        SoccerPlayer joe = new SoccerPlayer("joe", "23");
        SoccerPlayer duop = new SoccerPlayer("duop", "23");
        SoccerPlayer wat = new SoccerPlayer("wat", "23");

//        volleyball players
        VolleyPlayer master = new VolleyPlayer("master", "23");
        VolleyPlayer shifu = new VolleyPlayer("shifu", "23");
        VolleyPlayer panda = new VolleyPlayer("panda", "23");

        sanandiki.addPlayer(joe);
        sanandiki.addPlayer(duop);
        sanandiki.addPlayer(wat);

        chwele.addPlayer(master);
        chwele.addPlayer(shifu);
        chwele.addPlayer(panda);

//        printing all the football players
        List<SoccerPlayer> sanandikiMembers = sanandiki.getMembers();

        for (int i = 0; i < sanandikiMembers.size(); i++) {
            System.out.println(sanandikiMembers.get(i).getName());

        }

//        printing all the volleyball players
        List<VolleyPlayer> chweleMembers = chwele.getMembers();

        for (int i = 0; i < chweleMembers.size(); i++) {
            System.out.println(chweleMembers.get(i).getName());
        }





    }
}
