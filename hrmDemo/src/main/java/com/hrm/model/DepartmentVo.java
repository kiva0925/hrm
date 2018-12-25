package com.hrm.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentVo extends Department {
    private List<Title> titles = new ArrayList<>();

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    @Override
    public String toString() {
        return "DepartmentVo{" +
                "titles=" + titles +
                '}';
    }
}
