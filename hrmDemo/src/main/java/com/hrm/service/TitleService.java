package com.hrm.service;

import com.hrm.model.Title;

import java.util.List;

public interface TitleService {
    int addTitle(Title title);
    int delTitle(Title title);
    List<Title> getTitles();
}
