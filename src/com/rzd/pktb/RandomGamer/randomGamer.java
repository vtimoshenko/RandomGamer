package com.rzd.pktb.RandomGamer;

import com.rzd.pktb.SPSGame.gameSPS;
import com.rzd.pktb.SPSGame.playerSPS;

import java.util.Random;

/**
 * Created by SimpleUser on 18.06.2016.
 */
public class randomGamer implements playerSPS {
    @Override
    public int fight() {
        Random rand = new Random();
        int st = rand.nextInt(3);
        switch (st) {
            case 0:
                return gameSPS.PAPER;
            case 1:
                return gameSPS.SCISSORS;
            case 2:
                return gameSPS.STONE;
            default:
                return gameSPS.STONE;
        }
    }

    @Override
    public void result(int i, int i1) {

    }

    @Override
    public String about() {
        return "Игрок, всегда выкидывающий произвольный знак";
    }
}
