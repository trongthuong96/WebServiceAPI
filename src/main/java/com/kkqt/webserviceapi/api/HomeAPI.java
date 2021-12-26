package com.kkqt.webserviceapi.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class HomeAPI {

    @GetMapping("/")
    public String ShowHome(){
        return "<h1> Web Service API App Đọc Truyện Nhóm 4: <br> Thành Viên:<br> Đỗ Trọng Thưởng <br> Lê Huỳnh Hoàng Khang <br> Ngô Tuấn Kiệt <br> Lê Nguyễn Thiện Quang </h1>";
    }
}
