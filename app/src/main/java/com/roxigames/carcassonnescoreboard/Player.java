package com.roxigames.carcassonnescoreboard;

public class Player {

    private String name;
    private String color;
    private int score;

    public Player(String name, String color)
    {
        this.name = name;
        this.color = color;
        this.score = 0;
    }

    public Player(String name, String color, int score)
    {
        this.name = name;
        this.color = color;
        this.score = score;
    }

    public void addPointsToScore(int points)
    {
        this.score += points;

    }

    public void subtractPointsFromScore(int points)
    {
        this.score -= points;
    }

    public String getColor()
    {
        return this.color;
    }
}
