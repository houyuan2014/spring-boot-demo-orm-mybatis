package com.xkcoding.orm.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 用户实体类
 * </p>
 *
 * @package: com.xkcoding.orm.mybatis.entity
 * @description: 用户实体类
 * @author: yangkai.shen
 * @date: Created in 2018/11/8 10:58
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(value = "用户实体", description = "User Entity")
public class User implements Serializable {
	public User(int id, String username, String job) {
		this.id = id;
		this.name = username;
		this.job = job;
	}

	private static final long serialVersionUID = -1840831686851699943L;

	@ApiModelProperty(value = "主键id", required = true)
	private Integer id;

	@ApiModelProperty(value = "用户名", required = true)
	private String name;

	@ApiModelProperty(value = "工作岗位", required = true)
	private String job;

	@ApiModelProperty(value = "加密后的密码")
	private String password;

	@ApiModelProperty(value = "加密使用的盐")
	private String salt;

	@ApiModelProperty(value = "邮箱")
	private String email;

	@ApiModelProperty(value = "手机号")
	private String phoneNumber;

	@ApiModelProperty(value = "状态，-1：逻辑删除，0：禁用，1：启用")
	private Integer status;

	@ApiModelProperty(value = "创建时间")
	private Date createTime;

	@ApiModelProperty(value = "上次登录时间")
	private Date lastLoginTime;

	@ApiModelProperty(value = "上次更新时间")
	private Date lastUpdateTime;
}
