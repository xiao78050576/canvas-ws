package com.shizuku.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shizuku.web.bean.SysUser;
import com.shizuku.web.mapper.SysUserMapper;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
public class SysUserController {

	@Autowired
	private SysUserMapper userMapper;

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET)
	public List<SysUser> getUsers() {
		List<SysUser> users = userMapper.getAll();
		return users;
	}

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public SysUser getUser(Long id) {
		SysUser user = userMapper.get(id);
		return user;
	}

	@ApiOperation(value = "新增数据", notes = "新增数据")
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void save(@ApiParam(name = "新增用户", required = true) SysUser user) {
		userMapper.insert(user);
	}

	@RequestMapping(value = "update", method = RequestMethod.POST)
	public void update(SysUser user) {
		userMapper.update(user);
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.POST)
	public void delete(@PathVariable("id") Long id) {
		userMapper.delete(id);
	}

}