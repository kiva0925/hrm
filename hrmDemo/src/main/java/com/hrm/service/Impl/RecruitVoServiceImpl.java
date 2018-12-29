package com.hrm.service.Impl;

import com.hrm.dao.RecruitVoMapper;
import com.hrm.model.RecruitVo;
import com.hrm.service.RecruitVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class RecruitVoServiceImpl implements RecruitVoService {
    @Resource
    private RecruitVoMapper recruitVoMapper;

    @Override
    public List<RecruitVo> getRecruitVos() {
        return recruitVoMapper.getRecruitVos();
    }
}
