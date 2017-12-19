package nl.javacursus.gajemee.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.*;
import nl.javacursus.gajemee.model.*;
import nl.javacursus.gajemee.dao.*;

public class EventService implements IEventService{
	
	@Autowired
	private IEventDAO iEventDAO;

	public List<Event> findAll(){
		return this.iEventDAO.findAll();
	}
	
}
