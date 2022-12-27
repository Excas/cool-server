package com.msutar.cool.api.service.impl;

import cn.dev33.satoken.secure.BCrypt;
import cn.hutool.crypto.digest.DigestUtil;
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
import org.apache.tomcat.util.security.MD5Encoder;
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
    private final SysUserService sysUserService;
    @Override
    public LoginVO login(LoginDTO dto) {

        // 校验验证码
        String code = (String) redisService.get(CommonConstant.VALIDATE_CODE_PREFIX + dto.getCaptchaId());
        if (code == null || !code.equals(dto.getVerifyCode())) throw new CommonException("验证码错误");
        SysUser user = sysUserService.getByName(dto.getUsername());

        // TODO 校验账号密码
        if (!user.getPassword().equals(DigestUtil.md5Hex(dto.getPassword()))) {
            throw new CommonException("账号密码错误");
        }

        return null;
    }
}
