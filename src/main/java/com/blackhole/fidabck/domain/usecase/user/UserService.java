package com.blackhole.fidabck.domain.usecase.user;

import com.blackhole.fidabck.domain.model.UserApp;

import java.util.List;

public interface UserService {

    public List<UserApp> getUser();
}
