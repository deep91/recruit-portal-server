package org.pk.recruitportalserver.controller;

import java.util.ArrayList;
import java.util.List;

import org.pk.recruitportalserver.entities.User;
import org.pk.recruitportalserver.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/pk1/users")
public class UserRegistartionController {

	@Autowired
	private UserRepository userRepository;

	private List<User> users = new ArrayList<User>();

	@PostMapping(value = "/create")
	public User postCustomer(@RequestBody User user) {

		User user1 = new User();
		user1.setFirst_name(user.getFirst_name());
		user1.setLast_name(user.getLast_name());
		this.userRepository.save(user);
		return user;
	}

}
