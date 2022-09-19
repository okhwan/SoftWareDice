package com.software_engineering.demo.member;

import org.springframework.data.relational.core.sql.In;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<String, Member> st = new HashMap<>(); //이부분 Map<String,Dice>로 바꿔서 활용하게하기
    @Override
    public void save(Member member) {
        st.put(member.getName(),member);
    }

    @Override
    public Member findByName(String name) {
        return st.get(name);
    }
}
