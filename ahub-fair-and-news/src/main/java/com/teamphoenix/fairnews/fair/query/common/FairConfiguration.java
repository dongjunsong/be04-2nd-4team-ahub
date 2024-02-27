package com.teamphoenix.fairnews.fair.query.common;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.teamphoenix.fairnews.fair.query", annotationClass = Mapper.class )
public class FairConfiguration {
}
