package com.software_engineering.demo.member;

import com.software_engineering.demo.play.Dice;

import java.util.ArrayList;

public class Member {
    private String name;
    private Dice dice;

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", dice=" + dice +
                '}';
    }

    public Member(String name, Dice dice){
        this.name = name;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }
}
