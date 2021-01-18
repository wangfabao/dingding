package com.ruantong.dingding.service;

import com.ruantong.dingding.DTO.CreateVoteDTO;
import com.ruantong.dingding.VO.CreateVoteVO;
import com.ruantong.dingding.VO.UserVotingVO;
import com.ruantong.dingding.VO.ViewVoteVO;
import com.ruantong.dingding.VO.VotingResultStatisticsVO;
import com.ruantong.dingding.pojo.UserVoting;

public interface VoteService {
    CreateVoteDTO insertVote(CreateVoteVO createVoteVO);

    UserVoting userVoting(UserVotingVO userVotingVO);

    ViewVoteVO viewVote(String userId, String vid);

    VotingResultStatisticsVO votingResultStatistics(String userId, String vid);
}
