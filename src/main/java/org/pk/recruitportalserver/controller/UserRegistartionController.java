package org.pk.recruitportalserver.controller;
import java.util.ArrayList;
import java.util.List;

import org.pk.recruitportalserver.entities.User;
import org.pk.recruitportalserver.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/api/users")
public class UserRegistartionController {
	
	@Autowired
	private UserRepository userRepository;
	
	private List<User> users = new ArrayList<User>();
	
	@RequestMapping(method = RequestMethod.GET ,value = "/create")
	public String saveUser() {
		String r="Success";
		System.out.println("user");
//		this.userRepository.save(user);
		return r;
	
	}

}
