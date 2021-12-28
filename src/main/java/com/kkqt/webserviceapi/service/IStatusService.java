package com.kkqt.webserviceapi.service;

import com.kkqt.webserviceapi.dto.StatusDTO;

import java.util.List;

public interface IStatusService {
    List<StatusDTO> findAll();
}
