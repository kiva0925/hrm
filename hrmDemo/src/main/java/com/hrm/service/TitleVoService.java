package com.hrm.service;

import com.hrm.model.Department;
import com.hrm.model.TitleVo;

import java.util.List;

public interface TitleVoService {
    List<TitleVo> getTitleVos(Department department);
    TitleVo getTitleVo(TitleVo titleVo);
}
