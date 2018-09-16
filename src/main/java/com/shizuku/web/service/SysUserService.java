package com.shizuku.web.service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.IService;
import com.shizuku.web.bean.SysUser;

public interface SysUserService extends IService<SysUser> {
	List<SysUser> getAll();
}
