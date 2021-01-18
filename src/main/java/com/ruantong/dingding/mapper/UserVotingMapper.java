package com.ruantong.dingding.mapper;

import com.ruantong.dingding.DTO.UserVotingDTO;

import java.util.List;

public interface UserVotingMapper {
    void insertUserVoting(UserVotingDTO userVotingDTO);

    List<UserVotingDTO> findByUserId(String userId);

    List<UserVotingDTO> findByVid(String vid);


    UserVotingDTO findByUserIdAndVid(String userId, String vid);
}
