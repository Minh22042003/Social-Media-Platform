package com.example.SocialMediaPlatform.repository;

import com.example.SocialMediaPlatform.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
