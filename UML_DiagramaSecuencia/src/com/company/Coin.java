package com.company;

public class Coin
{
    String coinOption;
    public Coin()
    {

    }

    public String getCoinOption()
    {
        int n;
        n = (int)(Math.random()*2)+1;
        if(n==1)
            return "head";
        else
            return "tails";
    }
}
