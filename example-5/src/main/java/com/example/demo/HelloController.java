package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO: comment here
 */
@RestController
@RequestMapping("/")
public class HelloController {
	@Autowired
	AccountDao accountDao;

	@GetMapping("/")
	public String hello(){
		return "This is created by gradle!";
	}

	@GetMapping("/{username}")
	public String findAcountByUsername(@PathVariable(value="username") String username){
		Account account = accountDao.findById(username);
		System.out.println(account);
		return  account.getUsername();
	}
}
