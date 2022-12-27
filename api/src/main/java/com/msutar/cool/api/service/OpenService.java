package com.msutar.cool.api.service;

import com.msutar.cool.api.dto.LoginDTO;
import com.msutar.cool.api.vo.LoginVO;

public interface OpenService {
    LoginVO login(LoginDTO dto);
}
