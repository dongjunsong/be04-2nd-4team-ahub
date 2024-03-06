package com.teamphoenix.ahub.fair.command.service;

import com.teamphoenix.ahub.fair.command.dto.FairDTO;
import org.springframework.data.jpa.repository.Query;

public interface FairService {
    void removeFairPost(int postNum);

    void modifyFairPost(int postNum, FairDTO modifyInfo);

    @Query(value = "SELECT ")
//@Query(value = "SELECT CATEGORY_CODE, CATEGORY_NAME, REF_CATEGORY_CODE FROM Tbl_Category " +
//        "ORDER BY CATEGORY_CODE ASC", nativeQuery = true)
    FairDTO registFairPost(FairDTO newFairPost);
}
