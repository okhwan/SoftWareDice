package com.software_engineering.demo.judge;

import com.software_engineering.demo.member.Member;
import com.software_engineering.demo.play.Dice;

public class DiceJudgeImpl implements DiceJudge{
    @Override
    public String diceJudge(Dice dice, Dice dice2) {
        if(dice.isDiceLap()== true && dice2.isDiceLap() == true || dice.isDiceLap() == false && dice.isDiceLap() == false){
            if(dice.getDiceTotal() > dice2.getDiceTotal()){
                return dice.getMemberName()+" 승";
            } else if (dice.getDiceTotal() == dice2.getDiceTotal()) {
                return "무승부";
            }
            else {
                return dice.getMemberName()+" 패";
            }

        }
        else if (dice.isDiceLap() == true && dice2.isDiceLap() == false)  {
            return dice.getMemberName()+" 승";
        }
        else{
            return dice.getMemberName()+" 패";
        }
    }
}
