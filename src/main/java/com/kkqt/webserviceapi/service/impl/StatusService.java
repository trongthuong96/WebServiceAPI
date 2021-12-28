package com.kkqt.webserviceapi.service.impl;

import com.kkqt.webserviceapi.converter.StatusConverter;
import com.kkqt.webserviceapi.dto.StatusDTO;
import com.kkqt.webserviceapi.entity.StatusEntity;
import com.kkqt.webserviceapi.repository.StatusRepository;
import com.kkqt.webserviceapi.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StatusService implements IStatusService {

    @Autowired
    private StatusRepository statusRepository;

    @Autowired
    private StatusConverter statusConverter;

    @Override
    public List<StatusDTO> findAll() {
        List<StatusEntity> entityList = statusRepository.findAll();

        List<StatusDTO> dtoList = new ArrayList<>();
        for (StatusEntity item: entityList) {
            StatusDTO dto = new StatusDTO();
            dto = statusConverter.toDTO(item);
            dtoList.add(dto);
        }
        return dtoList;
    }
}
