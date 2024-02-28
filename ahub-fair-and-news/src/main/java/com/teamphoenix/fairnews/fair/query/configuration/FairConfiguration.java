package com.teamphoenix.fairnews.fair.query.configuration;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.teamphoenix.fairnews.fair.query.mapper", annotationClass = Mapper.class )
public class FairConfiguration {
}
