package com.hrm.service.Impl;

import com.hrm.dao.ManageVoMapper;
import com.hrm.model.ManageVo;
import com.hrm.service.ManageVoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManageVoServiceImpl implements ManageVoService {
    @Resource
    private ManageVoMapper manageVoMapper;

    @Override
    public List<ManageVo> getManageVo(ManageVo manageVo) {
        return manageVoMapper.getManageVo(manageVo);
    }
}
