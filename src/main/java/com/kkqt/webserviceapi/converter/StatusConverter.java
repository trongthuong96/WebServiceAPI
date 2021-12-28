package com.kkqt.webserviceapi.converter;

import com.kkqt.webserviceapi.dto.CategoryDTO;
import com.kkqt.webserviceapi.dto.StatusDTO;
import com.kkqt.webserviceapi.entity.CategoryEntity;
import com.kkqt.webserviceapi.entity.StatusEntity;
import org.springframework.stereotype.Component;

@Component
public class StatusConverter {
    public StatusDTO toDTO(StatusEntity entity){
        StatusDTO dto = new StatusDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }
}
