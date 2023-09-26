package com.example.demologin.service;

import com.example.demologin.LoginRequest.LoginRes;

import java.util.ArrayList;
import java.util.List;

public interface LoginService {
    boolean checkLogin(LoginRes loginRes);
}
