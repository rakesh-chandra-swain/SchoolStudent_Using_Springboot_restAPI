package com.nt.service;

import java.util.List;
import java.util.Optional;
import com.nt.domain.Login;

public interface LoginService {
	public String registerUser(Login login);
	public List<Login> showAlltraveller();
}
