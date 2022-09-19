package com.software_engineering.demo.play;

public class Dice {
    private String memberName;
    private int Dice1;
    private int Dice2;
    private int DiceTotal;
    private boolean diceLap;

    public Dice(String memberName, int dice1, int dice2, int diceTotal, boolean diceLap) {
        this.memberName = memberName;
        Dice1 = dice1;
        Dice2 = dice2;
        DiceTotal = diceTotal;
        this.diceLap = diceLap;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "memberName='" + memberName + '\'' +
                ", Dice1=" + Dice1 +
                ", Dice2=" + Dice2 +
                ", DiceTotal=" + DiceTotal +
                ", diceLap=" + diceLap +
                '}';
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getDice1() {
        return Dice1;
    }

    public void setDice1(int dice1) {
        Dice1 = dice1;
    }

    public int getDice2() {
        return Dice2;
    }

    public void setDice2(int dice2) {
        Dice2 = dice2;
    }

    public int getDiceTotal() {
        return DiceTotal;
    }

    public void setDiceTotal(int diceTotal) {
        DiceTotal = diceTotal;
    }

    public boolean isDiceLap() {
        return diceLap;
    }

    public void setDiceLap(boolean diceLap) {
        this.diceLap = diceLap;
    }
}
