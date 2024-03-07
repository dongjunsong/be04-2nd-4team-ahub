package com.teamphoenix.postreply.reply.command.repository;


import com.teamphoenix.postreply.reply.command.entity.Reply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<Reply, Integer> {
}
