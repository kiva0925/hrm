package com.hrm.service.Impl;

import com.hrm.dao.TitleVoMapper;
import com.hrm.model.Department;
import com.hrm.model.TitleVo;
import com.hrm.service.TitleVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TitleVoServiceImpl implements TitleVoService {
    @Resource
    private TitleVoMapper titleVoMapper;
    @Override
    public List<TitleVo> getTitleVos(Department department) {
        return titleVoMapper.getTitleVos(department);
    }

    @Override
    public TitleVo getTitleVo(TitleVo titleVo) {
        return titleVoMapper.getTitleVo(titleVo);
    }
}
