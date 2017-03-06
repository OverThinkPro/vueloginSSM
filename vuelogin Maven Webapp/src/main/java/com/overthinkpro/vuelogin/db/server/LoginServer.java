package com.overthinkpro.vuelogin.db.server;

import java.sql.SQLException;

import com.overthinkpro.vuelogin.bean.User;

public interface LoginServer {

	public String isUser(User user) throws SQLException;
	
	public int addUser(User user) throws SQLException;
}
