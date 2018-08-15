package com.hyt.simon.service;

import java.util.List;

import com.hyt.simon.entry.User;

public interface UserService {

    int addUser(User user);

    List<User> findAllUser(int pageNum, int pageSize);
}