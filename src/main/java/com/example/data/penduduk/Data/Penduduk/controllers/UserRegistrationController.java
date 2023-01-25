package com.example.data.penduduk.Data.Penduduk.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.data.penduduk.Data.Penduduk.dto.UserRegistrationDto;
import com.example.data.penduduk.Data.Penduduk.services.UsersService;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
    
    private UsersService usersService;

	public UserRegistrationController(UsersService usersService) {
		this.usersService = usersService;
	}

	@ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		usersService.save(registrationDto);
		return "redirect:/registration?success";
	}

}
