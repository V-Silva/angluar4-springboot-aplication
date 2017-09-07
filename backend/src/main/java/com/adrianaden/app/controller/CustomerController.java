package com.adrianaden.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.adrianaden.app.model.Customer;
import com.adrianaden.app.service.CustomerService;
import response.ResponseEntity;
import response.ResponseType;

@CrossOrigin
@RestController
@RequestMapping("api/customer")
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@RequestMapping(method = { RequestMethod.GET })
	public Object findAll() {
		List<Customer> customers = customerService.findAll();
		return new ResponseEntity(ResponseType.SUCCESS, "berhasil",customers);
	}
}