package com.company;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;
public class CoinGame
{
    private Player players[] = new Player[2];
    private Coin theCoin;

    public CoinGame()
    {
        startGame();
    }

    public void startGame()
    {
        boolean flipAgain = true;
        int n;
        players[0] = new Player();
        players[1] = new Player();
        theCoin = new Coin();

        while (flipAgain) {
            players[0].setCoinOption(players[0].getRandCoinOption());
            players[1].setCoinOption(players[0].getCoinOption());

            String winningFlip = theCoin.getCoinOption();
            players[0].didPlayerWin(winningFlip);
            n = (int)(Math.random()*2)+1;
            if(n == 1)
                flipAgain = true;
            else
                flipAgain = false;
            System.out.println(flipAgain);
        }

    }
}
