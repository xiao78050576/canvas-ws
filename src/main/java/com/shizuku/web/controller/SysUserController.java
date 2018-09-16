package com.shizuku.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shizuku.web.bean.SysUser;
import com.shizuku.web.service.SysUserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class SysUserController {

	@Autowired
	private SysUserService sysUserSerivce;

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<SysUser> getUsers() {
		List<SysUser> users = sysUserSerivce.getAll();
		return users;
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public SysUser getUser(Long id) {
		SysUser user = sysUserSerivce.getById(id);
		return user;
	}

	@ApiOperation(value = "新增数据", notes = "新增数据")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void save(@ApiParam(name = "新增用户", required = true) SysUser user) {
		sysUserSerivce.save(user);
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public void update(SysUser user) {
		sysUserSerivce.saveOrUpdate(user);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable("id") Long id) {
		sysUserSerivce.removeById(id);
	}

}