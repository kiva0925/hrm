package com.hrm.service;

import com.hrm.model.Bio;
import com.hrm.model.User;

public interface BioService {
    int addBio(Bio bio);
    int updateVio(Bio bio);
    Bio getBio(User user);
    Bio getBio(Bio bio);
}
