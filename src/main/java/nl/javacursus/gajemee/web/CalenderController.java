package nl.javacursus.gajemee.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import nl.javacursus.gajemee.service.ICalenderService;

@Controller
public class CalenderController {
	
	@Autowired
	private ICalenderService iCalenderService;
	
	@GetMapping("/calender")
	public String doCalender(Model model) {
		model.addAttribute("calender", this.iCalenderService.findAll());
		return "calender";
	}

}
