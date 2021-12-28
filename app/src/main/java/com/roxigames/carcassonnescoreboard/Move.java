package com.roxigames.carcassonnescoreboard;

public class Move {

    private Player player;
    private int pointsAdded;

    public Move(Player player, int pointsAdded)
    {
        this.player = player;
        this.pointsAdded = pointsAdded;
    }

    public String getPlayerColor()
    {
        return this.player.getColor();
    }

    public int getPointsAdded()
    {
        return this.pointsAdded;
    }
}
