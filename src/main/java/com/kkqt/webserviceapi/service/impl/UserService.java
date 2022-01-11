package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.converter.UserConverter;
import com.kkqt.webserviceapi.dto.UserDTO;
import com.kkqt.webserviceapi.entity.UserEntity;
import com.kkqt.webserviceapi.repository.UserRepository;
import com.kkqt.webserviceapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserConverter userConverter;

    @Override
    public UserDTO getByNameAndPass(String name, String pass) {
        UserEntity entity = userRepository.getByNameAndPass(name, pass);
        return  userConverter.toDTO(entity);
    }
}
