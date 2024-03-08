package com.teamphoenix.ahub.command.repository;

import com.teamphoenix.ahub.command.aggregate.MemberInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends JpaRepository<MemberInfo, Integer> {
    MemberInfo findByMemberCode(int memberCode);

    MemberInfo findByMemberId(String memberId);
}
