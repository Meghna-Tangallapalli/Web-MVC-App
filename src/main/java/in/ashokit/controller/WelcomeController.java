package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@GetMapping("/msg/{name}")
	public String viewMsg(@PathVariable("name") String name, Model model) {
		String textMsg = name + " Welcome to facebook";
		model.addAttribute("msg", textMsg);
		return "index";
		
	}
}
