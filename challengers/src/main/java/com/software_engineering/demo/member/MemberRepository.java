package com.software_engineering.demo.member;

public interface MemberRepository {
    void save(Member member);
    Member findByName(String name);
}
