package com.blackhole.fidabck.domain.usecase.user;

import com.blackhole.fidabck.domain.model.User;
import com.blackhole.fidabck.infrastructure.drivenadapter.jpa.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserUseCase implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUser() {
        return userRepository.findAll();
    }
}
