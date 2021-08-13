package com.uxpsystems.assignment.service;

import com.uxpsystems.assignment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserService extends JpaRepository<User,Long> {
}
