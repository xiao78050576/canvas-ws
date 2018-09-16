package com.shizuku.web.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shizuku.web.bean.SysUser;
import com.shizuku.web.mapper.SysUserMapper;
import com.shizuku.web.service.SysUserService;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

	@Override
	public List<SysUser> getAll() {
		return baseMapper.getAll();
	}

}
