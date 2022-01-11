package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.UserDTO;
import com.kkqt.webserviceapi.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserAPI {

    @Autowired
    IUserService userService;

    @PostMapping("/login")
    public UserDTO userDTO(@RequestBody UserDTO dto){
        return userService.getByNameAndPass(dto.getName(),dto.getPass());
    }
}
