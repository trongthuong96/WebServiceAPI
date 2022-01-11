package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.UserDTO;

public interface IUserService {
    UserDTO getByNameAndPass(String name, String pass);
}
