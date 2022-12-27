package com.msutar.cool.api.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.msutar.cool.api.entity.SysUser;
import com.msutar.cool.api.mapper.SysUserMapper;
import com.msutar.cool.api.service.SysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Esc
 * @since 2022-03-28
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

    @Override
    public SysUser getByName(String username) {
        return baseMapper.selectList(new LambdaQueryWrapper<SysUser>().eq(SysUser::getUsername, username).last("limit 1"))
                .stream().findFirst()
                .orElse(null);
    }
}
