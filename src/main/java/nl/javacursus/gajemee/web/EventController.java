package nl.javacursus.gajemee.web;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.ArrayList;
import nl.javacursus.gajemee.dao.*;
import nl.javacursus.gajemee.model.*;
import nl.javacursus.gajemee.service.*;

public class EventController {
	
	@Autowired
	private IEventService iEventService;
	

	@GetMapping("")
	public String doDemo(Model model) {
		model.addAttribute("events", this.iEventService.findAll());
	}
}
