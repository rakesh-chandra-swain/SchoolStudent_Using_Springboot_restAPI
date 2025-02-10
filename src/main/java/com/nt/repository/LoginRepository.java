package com.nt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.domain.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {
	 	
}
