package com.overthinkpro.vuelogin.action;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.overthinkpro.vuelogin.bean.User;
import com.overthinkpro.vuelogin.db.server.LoginServer;

@Controller
@RequestMapping("/user")
public class LoginAction {

	@Autowired
	private LoginServer loginServer;

	// @CrossOrigin(origins="http://192.168.159.1", maxAge=3600)
	@RequestMapping(value = "/login")
	public @ResponseBody String login(Model model, @RequestBody User user) throws SQLException {
		System.out.println(user.getUserName() + "28345678");
		
		if (!user.getUserName().equals("") || !user.getPassword().equals("")) {
			String username = loginServer.isUser(user);
			if (user.getUserName().equals(username)) {
				return user.toString();
			}
		}
		return user.toString();
	}

	@RequestMapping("/register")
	public String regist(Model model, User user) throws SQLException {
		if (!user.getUserName().equals("") || !user.getPassword().equals("")) {
			int num = loginServer.addUser(user);
			if (num == 1) {
				return "success";
			}
		}
		return "register";
	}

}
