package com.hrm.service;

import com.hrm.model.User;

public interface UserService {
    int register(User user);
    User login(User user);
}
