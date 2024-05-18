package com.example.membermybatis.service;


import com.example.membermybatis.domain.Member;
import com.example.membermybatis.repository.MemberMyBatisRepository;
import org.springframework.stereotype.Service;

import java.util.List;

//@Transactional
@Service
public class MemberService {

    private final MemberMyBatisRepository memberRepository;

    public MemberService(MemberMyBatisRepository memberRepository) {
        this.memberRepository = memberRepository;
    }


//    public Long join(Member member) {
//        validateDuplicateMember(member);
//        memberRepository.save(member);
//        return member.getId();
//    }
//
//    private void validateDuplicateMember(Member member){
//        memberRepository.findByName(member.getName())
//                .ifPresent(m -> {
//                    throw new IllegalStateException("이미 존재하는 회원입니다.");
//                });
//    }
//
//    public List<Member> findMembers() {
//        return memberRepository.findAll();
//    }
////
//    public Optional<Member> findOne(Long memberId) {
//        return memberRepository.findById(memberId);
//    }
}
