package com.software_engineering.demo.play;

import com.software_engineering.demo.member.MemberRepository;
import org.springframework.security.core.parameters.P;

import java.util.Random;

public class DicePlayImpl implements DicePlay{
    private final MemberRepository memberRepository;

    private int diceEx1, diceEx2;
    private boolean lap;
    public DicePlayImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Dice dicePlay(String player) {
        Random random = new Random();
        diceEx1 = random.nextInt(5)+1;
        diceEx2 = random.nextInt(5) +1;
        if(diceEx2 == diceEx1){
            lap = true;
        }
        else {
            lap = false;
        }
        return new Dice(player,diceEx1, diceEx2, diceEx1+diceEx2, lap);
    }
}
