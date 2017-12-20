package nl.javacursus.gajemee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.javacursus.gajemee.dao.IEventDAO;
import nl.javacursus.gajemee.model.Event;

@Service
public class EventService implements IEventService{
	
	@Autowired
	private IEventDAO iEventDAO;

	public List<Event> findAll(){
		return this.iEventDAO.findAll();
	}
	
}
