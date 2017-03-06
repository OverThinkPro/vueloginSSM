package com.overthinkpro.vuelogin.db.mapper;

import java.sql.SQLException;

import com.overthinkpro.vuelogin.bean.User;

public interface LoginMapper {
	
	public String isUser(User user) throws SQLException;
	
	public int addUser(User user) throws SQLException;
}
