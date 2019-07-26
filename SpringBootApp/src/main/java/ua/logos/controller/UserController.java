package ua.logos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("users")

public class UserController {

	@GetMapping({ "/", "" })
	public String showUsers() {
		return "users/users";
	}

	@GetMapping("/{userId}")
	public String showUserId(@PathVariable("userId") Long id, Model model) {
		System.out.println("user`s id = " + id);
		model.addAttribute("userIDkey", id);
		return "users/userInfo";
	}

	@GetMapping("/editUser")
	public String editUser() {
		return "users/editUser";
	}

	@PostMapping("/editUser")
	public String showUserName(@RequestParam("name") String name, @RequestParam("desc") String desc) {
		System.out.println("name of user: " + name);
		System.out.println("description of user: " + desc);
		return "redirect:/users";
	}
	
	@PostMapping("/deleteUser")
	public String deleteUser() {
		return "";
	}

}
