package com.adrianaden.app.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.adrianaden.app.response.ResponseEntity;
import com.adrianaden.app.response.ResponseType;
import com.adrianaden.app.util.JwtUtil;

@CrossOrigin
@RestController
@RequestMapping("api/auth/login")
public class AuthController {
	
	@Autowired
	JwtUtil jwtUtil;
	
	@RequestMapping(method = { RequestMethod.GET })
	public Object getLoginAuth() {

		String token = jwtUtil.createJWT("1", "adrianaden", "token", System.currentTimeMillis()); 
		return new ResponseEntity(ResponseType.SUCCESS, "Login Success", token);
	}
}
