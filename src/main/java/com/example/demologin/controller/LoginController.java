package com.example.demologin.controller;

import com.example.demologin.LoginRequest.LoginRes;
import com.example.demologin.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class LoginController {
    @Autowired
    LoginService loginService;
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginRes loginRes) {
        if(!loginService.checkLogin(loginRes)){
            return new ResponseEntity<>("Bạn đã đăng nhập từ thiết bị khác. Bạn bị đá ra.", HttpStatus.UNAUTHORIZED);
        }
       return new ResponseEntity<>("Đăng nhập thành công.", HttpStatus.OK);
    }


}
