package com.hrm.service;


import com.hrm.model.Groom;

import java.util.List;

public interface GroomService {
    int addGroom(Groom groom);
    int deleteGroom(Integer gId);
    int updateGroom(Groom groom);
    List<Groom> getGrooms();
}
