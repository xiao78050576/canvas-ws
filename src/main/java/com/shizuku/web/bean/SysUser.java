package com.shizuku.web.bean;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@TableName("sys_user")
public class SysUser implements Serializable {

	private static final long serialVersionUID = 3085443196443016310L;

	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	@TableField("name")
	private String name;

	@TableField("username")
	private String username;

	@TableField("password")
	private String password;

	@TableField("comment")
	private String comment;

}
