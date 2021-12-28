package com.kkqt.webserviceapi.api;

import com.kkqt.webserviceapi.dto.StatusDTO;
import com.kkqt.webserviceapi.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class StatusAPI {
    @Autowired
    private IStatusService statusService;

    @GetMapping(value = "/status")
    public List<StatusDTO> dtoList (){
        return statusService.findAll();
    }
}
