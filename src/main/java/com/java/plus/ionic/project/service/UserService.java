package com.java.plus.ionic.project.service;

import org.springframework.security.core.context.SecurityContextHolder;

import com.java.plus.ionic.project.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		}
		catch (Exception e) {
			return null;
		}
	}
}