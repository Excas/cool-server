package com.msutar.cool.api.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Esc
 * @since 2022-03-25
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
    @TableField("createTime")
    private LocalDateTime createtime;

    /**
     * 更新时间
     */
    @TableField("updateTime")
    private LocalDateTime updatetime;

    /**
     * 部门ID
     */
    @TableField("departmentId")
    private Long departmentid;

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
    @TableField("passwordV")
    private Integer passwordv;

    /**
     * 昵称
     */
    @TableField("nickName")
    private String nickname;

    /**
     * 头像
     */
    @TableField("headImg")
    private String headimg;

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
    @TableField("socketId")
    private String socketid;


}
