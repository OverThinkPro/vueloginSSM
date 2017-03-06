package com.overthinkpro.vuelogin.db.server.impl;

import java.sql.SQLException;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.overthinkpro.vuelogin.bean.User;
import com.overthinkpro.vuelogin.db.mapper.LoginMapper;
import com.overthinkpro.vuelogin.db.server.LoginServer;

@Service("loginServer")
public class LoginServerImpl implements LoginServer {

	@Resource
	private LoginMapper loginMapper;

	public String isUser(User user) throws SQLException {
		return loginMapper.isUser(user);
	}

	public int addUser(User user) throws SQLException {
		return loginMapper.addUser(user);
	}

}
