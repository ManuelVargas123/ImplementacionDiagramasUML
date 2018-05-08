package com.company;

public class Player
{
    private String username;
    private String coinOption;
    public Player()
    {
    }

    public String getRandCoinOption()
    {
        int n;
        n = (int)(Math.random()*2)+1;
        if(n==1)
            return "head";
        else
            return "tails";
    }

    public void setCoinOption(String coinOption)
    {
        if(coinOption == "head")
            this.coinOption = "tails";
        else
            this.coinOption = "head";
    }

    public void didPlayerWin(String winningFlip)
    {
        if(coinOption == winningFlip)
            System.out.println("You win");
        else
            System.out.println("The other player wins");
    }

    public String getCoinOption() {
        return coinOption;
    }
}
