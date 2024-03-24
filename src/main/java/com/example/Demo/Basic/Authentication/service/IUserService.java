package com.example.Demo.Basic.Authentication.service;

import com.example.Demo.Basic.Authentication.entity.User;

import java.util.List;

public interface IUserService {

    User registerNewUser(User user);

    List<User> findAll();

}
