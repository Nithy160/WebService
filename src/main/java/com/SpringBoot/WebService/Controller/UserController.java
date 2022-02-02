package com.SpringBoot.WebService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
 
	@GetMapping("/welcome/{user}")
	public String welcome(@PathVariable String user)
	{
		return "Hello, "+ user;
	}
}
