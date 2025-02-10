package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.domain.Login;
import com.nt.repository.LoginRepository;

@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginRepository repo;

	@Override
	public String registerUser(Login login) {
		
		long idVal=repo.save(login).getId();
		return "Student is login having the id Value::"+idVal;
	}

	@Override
	public List<Login> showAlltraveller() {
		return repo.findAll().stream().sorted((t1,t2)->t1.getUserName().compareTo(t2.getUserName())).toList();
		
	}



}
