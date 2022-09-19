package com.software_engineering.demo;

import com.software_engineering.demo.diceService.DiceService;
import com.software_engineering.demo.diceService.DiceServiceImpl;
import com.software_engineering.demo.judge.DiceJudge;
import com.software_engineering.demo.judge.DiceJudgeImpl;
import com.software_engineering.demo.member.Member;
import com.software_engineering.demo.member.MemberPlay;
import com.software_engineering.demo.member.MemberPlayImpl;
import com.software_engineering.demo.member.MemoryMemberRepository;
import com.software_engineering.demo.play.DicePlay;
import com.software_engineering.demo.play.DicePlayImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiceConfig {

    @Bean
    public MemberPlay memberPlay() {return new MemberPlayImpl(memberRepository());}

    @Bean
    public MemoryMemberRepository memberRepository(){return new MemoryMemberRepository();
    }
    @Bean
    public DicePlay dicePlay() {return new DicePlayImpl(memberRepository());
    }

    @Bean
    public DiceService diceService(){return new DiceServiceImpl();
    }
    @Bean
    public DiceJudge diceJudge(){return new DiceJudgeImpl();
    }


}
