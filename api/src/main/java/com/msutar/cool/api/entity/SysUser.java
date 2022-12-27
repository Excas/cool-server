package com.msutar.cool.api.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Esc
 * @since 2022-03-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("base_sys_user")
public class SysUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建时间
     */
    @TableField(value = "createTime")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(value = "updateTime")
    private LocalDateTime updateTime;

    /**
     * 部门ID
     */
    @TableField(value = "departmentId")
    private Long departmentId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码版本, 作用是改完密码，让原来的token失效
     */
    @TableField(value = "passwordV")
    private Integer passwordV;

    /**
     * 昵称
     */
    @TableField(value = "nickName")
    private String nickName;

    /**
     * 头像
     */
    @TableField(value = "headImg")
    private String headImg;

    /**
     * 手机
     */
    private String phone;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态 0:禁用 1：启用
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * socketId
     */
    @TableField(value = "socketId")
    private String socketId;


}
