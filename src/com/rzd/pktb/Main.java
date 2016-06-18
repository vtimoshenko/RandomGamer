package com.rzd.pktb;

import com.rzd.pktb.RandomGamer.randomGamer;

public class Main {

    public static void main(String[] args) {
        randomGamer gamer = new randomGamer();
        for (int i=0;i<100;i++)
        {
            System.out.println(gamer.fight());
        }
    }
}
