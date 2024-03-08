package com.TM.spring.jpa;

import jakarta.validation.*;
import org.springframework.ui.*;
import org.springframework.validation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

import org.springframework.beans.factory.annotation.*;

@Controller
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	private Optional<User> nullReturnU = Optional.empty(); 
	
	@RequestMapping("")
	public String signInHome(Model model) {
		model.addAttribute("user", new User());
		return "signin";
	}
	
	@PostMapping("/signIn")
	public String signIn(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "signin";
		} else if ( userRepository.findById(user.getUsername()) == nullReturnU) {
			return "signInError";
		} else {
			return "signInSuccess";
		}
	}
	
	@RequestMapping("/register")
	public String registerHome(Model model) {
		model.addAttribute("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String register(@Valid User user, BindingResult result, Model model) {
		if (result.hasErrors()) {
			return "register";
		}
		userRepository.save(user);
		return "registerSuccess";
	}
}