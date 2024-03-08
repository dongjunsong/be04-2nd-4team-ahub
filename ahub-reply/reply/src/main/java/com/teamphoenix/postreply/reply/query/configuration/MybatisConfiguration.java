package com.teamphoenix.postreply.reply.query.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.teamphoenix.postreply.reply.query", annotationClass = Mapper.class)
public class MybatisConfiguration {
}
