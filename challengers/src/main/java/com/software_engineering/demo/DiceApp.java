package com.software_engineering.demo;

import com.software_engineering.demo.diceService.DiceService;
import com.software_engineering.demo.judge.DiceJudge;
import com.software_engineering.demo.member.Member;
import com.software_engineering.demo.member.MemberPlay;
import com.software_engineering.demo.play.Dice;
import com.software_engineering.demo.play.DicePlay;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class DiceApp {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DiceConfig.class);
        MemberPlay memberPlay = applicationContext.getBean("memberPlay", MemberPlay.class);
        DiceService diceService = applicationContext.getBean("diceService", DiceService.class);
        DicePlay dicePlay = applicationContext.getBean("dicePlay", DicePlay.class);
        DiceJudge diceJudge = applicationContext.getBean("diceJudge", DiceJudge.class);
        Scanner in = new Scanner(System.in);

        while (true){
            String name1 = diceService.userInfo();
            Dice dice1 = dicePlay.dicePlay(name1); //Dice play시 Dice객체 생성
            Member member1 = new Member(name1,dice1);
            memberPlay.play(member1);
            String name2 = diceService.userInfo();
            Dice dice2 = dicePlay.dicePlay(name2);
            Member member2 = new Member(name2,dice2);
            memberPlay.play(member2);
            System.out.println(dice1.toString() + "\n" + dice2.toString());
            System.out.println(diceJudge.diceJudge(dice1, dice2));
            System.out.print("끝내시려면 1번을 눌러주세요 계속하려면 0번을 눌러주세요");
            int real = in.nextInt();
            if(real == 1){
                break;
            }
        }

    }









}
