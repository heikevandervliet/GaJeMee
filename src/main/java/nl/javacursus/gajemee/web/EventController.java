package nl.javacursus.gajemee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import nl.javacursus.gajemee.service.*;

@Controller
public class EventController {

	@Autowired
	private IEventService iEventService;

	@GetMapping("/hello")
	public String doDemo(Model model) {
		model.addAttribute("events", this.iEventService.findAll());
		return "hello";
	}
}
