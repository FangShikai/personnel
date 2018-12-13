package com.SSM.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.SSM.pojo.User;
import com.SSM.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping(value = "checkUser", method = { RequestMethod.GET, RequestMethod.POST })
	public String checkUser(User user,Model model,HttpServletRequest request) {
			User u = userService.selectUser(user);
			HttpSession session = request.getSession();
			if(u!=null){
				session.setAttribute("username", u.getUsername());
				return "index";
			}else{
		       
				return "login";
			}
          
	}
}
