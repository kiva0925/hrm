package com.hrm.service;


import com.hrm.model.Quit;

import java.util.List;

public interface QuitService {
    int addQuit(Quit quit);
    int deleteQuit(Integer qId);
    int updateQuit(Quit quit);
    List<Quit> getQuit(Quit quit);
}
