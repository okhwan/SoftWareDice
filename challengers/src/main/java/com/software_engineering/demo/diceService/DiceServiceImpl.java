package com.software_engineering.demo.diceService;

import java.util.Scanner;

public class DiceServiceImpl implements DiceService{
    String naming;
    @Override
    public String userInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사용자의 정보를 입력하세요");
        naming = sc.nextLine();
        return naming;
    }
}
