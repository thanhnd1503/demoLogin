package com.example.demologin.service;

import com.example.demologin.LoginRequest.LoginRes;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class LoginServiceImpl implements LoginService{
    List<LoginRes> loginRequestList = new ArrayList<>();
    @Override
    public boolean checkLogin(LoginRes loginRes) {
        for (LoginRes storedLoginInfo : loginRequestList) {
            if (storedLoginInfo.getUsername().equals(loginRes.getUsername())) {
                loginRequestList.remove(storedLoginInfo);
                return false;
            }
        }
        loginRequestList.add(loginRes);
        return true;
    }
}
