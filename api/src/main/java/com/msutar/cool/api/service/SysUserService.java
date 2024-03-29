package com.msutar.cool.api.service;

import com.msutar.cool.api.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author Esc
 * @since 2022-03-28
 */
public interface SysUserService extends IService<SysUser> {
    SysUser getByName(String username);
}
