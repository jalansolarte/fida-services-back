package com.blackhole.fidabck.infrastructure.drivenadapter.jpa;

import com.blackhole.fidabck.domain.model.UserApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserApp, Integer> {
}
