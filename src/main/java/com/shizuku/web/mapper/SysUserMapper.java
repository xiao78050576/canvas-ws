package com.shizuku.web.mapper;

import java.util.List;

import com.shizuku.web.bean.SysUser;

public interface SysUserMapper {
	List<SysUser> getAll();

	SysUser get(Long id);

	void insert(SysUser user);

	void update(SysUser user);

	void delete(Long id);
}
