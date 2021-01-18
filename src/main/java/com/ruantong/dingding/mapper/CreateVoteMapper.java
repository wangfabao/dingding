package com.ruantong.dingding.mapper;

import com.ruantong.dingding.DTO.CreateVoteDTO;
import com.ruantong.dingding.DTO.UserVotingDTO;

public interface CreateVoteMapper {

    void insertVote(CreateVoteDTO createVoteDTO);

    CreateVoteDTO findByVid(String uuid32);

    CreateVoteDTO findByUserIdAndVid(String userId,String vid);
}
