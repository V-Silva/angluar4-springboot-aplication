package com.adrianaden.app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.adrianaden.app.exception.JwtExceptionHandler;
import com.adrianaden.app.response.ResponseBody;
import com.adrianaden.app.response.ResponseCode;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(JwtExceptionHandler.class)
	public ResponseEntity<ResponseBody> jwtExceptionHandler(JwtExceptionHandler e) {
		log.info(e.getMessage(), e);
		ResponseBody body = new ResponseBody(ResponseCode.SUCCESS, e.getMessage(), null);
		return ResponseEntity.badRequest().body(body);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ResponseBody> exceptionHandler(Exception e) {
		log.info(e.getMessage(), e);
		ResponseBody body = new ResponseBody(ResponseCode.SUCCESS, "Server Internal Error", null);
		return ResponseEntity.badRequest().body(body);
	}
}
