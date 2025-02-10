package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.nt.domain.Login;

import com.nt.service.LoginService;

@RestController
@RequestMapping("/login-api")
public class ControllerClass {
	
	  @Autowired
	    private LoginService loginService;
	  
	  @PostMapping("/login")
	  public ResponseEntity<String> enrollTourist(@RequestBody Login login){
			try {
				//use service
				String resultMsg=loginService.registerUser(login);
				return new ResponseEntity<String>(resultMsg,HttpStatus.CREATED);
			}
			catch(Exception e) {
				return new ResponseEntity<String>("problem is Login Enrollment",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		@GetMapping("/all")
		public ResponseEntity<?> showAllTourist(){
			try {
				//use service
				List<Login> list=loginService.showAlltraveller();
				return new ResponseEntity<List<Login>>(list,HttpStatus.OK);
			}
			catch(Exception e) {
				return new ResponseEntity<String>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
}
