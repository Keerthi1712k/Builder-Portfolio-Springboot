package com.keerthi.Service.Interfaces;

import com.keerthi.DTO.UserDTO;
import com.keerthi.Entity.User;

import java.util.List;

public interface UserService {
    User createUser(UserDTO dto);
    List<User> getAllUsers();
    User getUserById(Long id);
}
