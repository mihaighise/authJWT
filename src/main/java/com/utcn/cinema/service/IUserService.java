package com.utcn.cinema.service;

import com.utcn.cinema.model.User;
import com.utcn.cinema.model.UserRole;

import java.util.List;

public interface IUserService {

    User saveUser(User user);
    UserRole saveUserRole(UserRole userRole);
    void addRoleToUser(String username, String roleName);
    User getUser(String username);
    List<User> getUsers();
}
