package com.teamphoenix.fairnews.fair.query;

import com.teamphoenix.fairnews.fair.query.common.FairDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FairMapper {

    FairDTO getFairPost(int postNum);

    List<FairDTO> searchPostsByCondition(FairDTO searchInfo) ;
}
