package nl.javacursus.gajemee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.javacursus.gajemee.dao.ICalenderDAO;
import nl.javacursus.gajemee.model.Calender;

@Service
public class CalenderService implements ICalenderService {

	@Autowired
	private ICalenderDAO iCalenderDAO;

	public List<Calender> findAll() {
		return this.iCalenderDAO.findAll();
	}

}
