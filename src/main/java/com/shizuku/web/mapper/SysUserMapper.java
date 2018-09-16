package com.shizuku.web.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.shizuku.web.bean.SysUser;

@Repository
public interface SysUserMapper extends BaseMapper<SysUser> {
	List<SysUser> getAll();

	SysUser get(Long id);

	void add(SysUser user);

	void update(SysUser user);

	void delete(Long id);
}
