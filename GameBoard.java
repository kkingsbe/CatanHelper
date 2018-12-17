package com.example.kkingsbe.cataanhelper;

import java.util.ArrayList;

public class GameBoard {
    ArrayList<Settlement> settlements = new ArrayList<>();

    public void newSettlement(Settlement settlement){
        settlements.add(settlement);
    }
}
