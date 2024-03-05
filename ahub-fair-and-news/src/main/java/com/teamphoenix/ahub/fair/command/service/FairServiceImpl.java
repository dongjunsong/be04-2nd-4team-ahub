package com.teamphoenix.ahub.fair.command.service;

import com.teamphoenix.ahub.fair.command.dto.FairDTO;
import com.teamphoenix.ahub.fair.command.aggregate.Fair;
import com.teamphoenix.ahub.fair.command.repository.FairRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "CommandFairService")
@Slf4j
public class FairServiceImpl implements FairService {

    private final FairRepository fairRepository;
    private final ModelMapper  modelMapper;
    @Autowired
    public FairServiceImpl(FairRepository fairRepository, ModelMapper modelMapper) {
        this.fairRepository = fairRepository;
        this.modelMapper = modelMapper;
    }

    @Transactional
    public void registFairPost(FairDTO fairInfo) {

        System.out.println("fairInfo = " + fairInfo);
//        log.info("ModelMapper 동작 확인 : {}", modelMapper.map(fairInfo, Fair.class));
        fairRepository.save(modelMapper.map(fairInfo, Fair.class));

    }
}
