package com.msutar.cool.api.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.msutar.cool.api.common.entity.CommonConstant;
import com.msutar.cool.api.common.exception.CommonException;
import com.msutar.cool.api.common.service.RedisService;
import com.msutar.cool.api.dto.LoginDTO;
import com.msutar.cool.api.entity.SysUser;
import com.msutar.cool.api.mapper.SysUserMapper;
import com.msutar.cool.api.service.OpenService;
import com.msutar.cool.api.service.SysUserService;
import com.msutar.cool.api.vo.LoginVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Esc
 * @since 2022-12-27
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class OpenServiceImpl implements OpenService {
    private final RedisService redisService;
    @Override
    public LoginVO login(LoginDTO dto) {

        // 校验验证码
        String code = (String) redisService.get(CommonConstant.VALIDATE_CODE_PREFIX + dto.getCaptchaId());
        if (code == null || !code.equals(dto.getVerifyCode())) throw new CommonException("验证码错误");
        // TODO 校验账号密码

        return null;
    }
}
