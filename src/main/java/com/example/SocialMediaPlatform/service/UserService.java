package com.example.SocialMediaPlatform.service;

import com.example.SocialMediaPlatform.Model.User;
import com.example.SocialMediaPlatform.controller.DTO.UserRegistrationDto;

public interface UserService {
    User save(UserRegistrationDto userRegistrationDto);
}
