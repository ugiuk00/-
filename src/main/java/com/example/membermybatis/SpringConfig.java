package com.example.membermybatis;

import com.example.membermybatis.repository.MemberMyBatisRepository;
import com.example.membermybatis.service.MemberService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.example.membermybatis.repository")
public class SpringConfig {
    private final MemberMyBatisRepository memberRepository;

    public SpringConfig(MemberMyBatisRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}