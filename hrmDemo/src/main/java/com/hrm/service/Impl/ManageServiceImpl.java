package com.hrm.service.Impl;

import com.hrm.dao.ManageMapper;
import com.hrm.model.Manage;
import com.hrm.service.ManageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManageServiceImpl implements ManageService {
    @Resource
    private ManageMapper manageMapper;

    @Override
    public int addManage(Manage manage, String[] staffs) {
        int i = 0;
        if(staffs.length>0){
            for (String staff : staffs) {
                manage.setsId(Integer.parseInt(staff));
                i = manageMapper.insertSelective(manage);
            }
        }
        return i;
    }
}
