package com.example.membermybatis.repository;


import com.example.membermybatis.entity.MemberEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MemberMyBatisRepository {
    void save(MemberEntity memberEntity);

    List<MemberEntity> findAll();
    Optional<MemberEntity> findById(Long memberId);
    Optional<MemberEntity> findByName(String memberName);

    void update(MemberEntity memberEntity);
    void delete(MemberEntity memberEntity);
}
