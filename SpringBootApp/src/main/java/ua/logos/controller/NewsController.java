package ua.logos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("news")

public class NewsController {
	
	@GetMapping({ "/", "" })
	public String showNews() {
		return "news/news";
	}

	@GetMapping("/{newsId}")
	public String showNewsById(@PathVariable("newsId") Long id, Model model) {
		System.out.println("news id = " + id);
		model.addAttribute("newsIdKey", id);
		return "news/newsPreview";
	}

	@GetMapping("/add")
	public String showAddNewsForm() {
		return "news/addNews";
	}

	@PostMapping("/add")
	public String addNews(@RequestParam("title") String newsTitle, @RequestParam("desc") String desc) {
		System.out.println("news title " + newsTitle);
		System.out.println("description: " + desc);
		return "redirect:/news";
	}

	@GetMapping("{userId}/news/{newsId}")
	public String getNewsAuthor(@PathVariable("userId") Long userId, @PathVariable("newsId") Long newsId,
			@RequestParam(name = "name", required = false) String name) {
		System.out.println("User id: " + userId);
		System.out.println("News id: " + newsId);
		System.out.println("author name: " + name);
		return "news/news";
	}
}
