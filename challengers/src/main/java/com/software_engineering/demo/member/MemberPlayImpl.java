package com.software_engineering.demo.member;

public class MemberPlayImpl implements MemberPlay{
    private MemberRepository memberRepository;

    public MemberPlayImpl(MemberRepository memberRepository){
    this.memberRepository = memberRepository;
    }
    @Override
    public void play(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(String name) {
        return memberRepository.findByName(name);
    }
}
