package com.kkqt.webserviceapi.converter;

import com.kkqt.webserviceapi.dto.UserDTO;
import com.kkqt.webserviceapi.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    public UserEntity toEntity(UserDTO dto){
        UserEntity entity = new UserEntity();
        entity.setName(dto.getName());
        entity.setFullName(dto.getFullName());
        entity.setPass(dto.getPass());
        entity.setEmail(dto.getEmail());
        entity.setImage(dto.getImage());
        return entity;
    }

    public UserDTO toDTO(UserEntity entity){
        UserDTO dto = new UserDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setFullName(entity.getFullName());
        dto.setPass(entity.getPass());
        dto.setImage(entity.getImage());
        dto.setDateCreate(entity.getDateCreate());
        dto.setRole(entity.getRole().getName());
        return dto;
    }

    public UserEntity toEntity(UserDTO dto, UserEntity entity){
        entity.setName(dto.getName());
        entity.setFullName(dto.getFullName());
        entity.setPass(dto.getPass());
        entity.setEmail(dto.getEmail());
        entity.setImage(dto.getImage());
        return entity;
    }
}
