package nl.javacursus.gajemee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import nl.javacursus.gajemee.service.IProfileService;

@Controller
public class ProfileController {

	@Autowired
	private IProfileService iProfileService;

	@GetMapping("/profile/{profileID}")
	public String doProfile(@PathVariable int profileID, Model model) {
		model.addAttribute("profile", this.iProfileService.findOne(profileID));
		//model.addAttribute("preference", this.)
		return "profile";
	}

}
