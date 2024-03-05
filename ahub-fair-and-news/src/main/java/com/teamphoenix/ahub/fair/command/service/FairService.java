package com.teamphoenix.ahub.fair.command.service;

import com.teamphoenix.ahub.fair.command.dto.FairDTO;

public interface FairService {
    void removeFairPost(int postNum);

    void modifyFairPost(int postNum, FairDTO modifyInfo);

    void registFairPost(FairDTO newFairPost);
}
