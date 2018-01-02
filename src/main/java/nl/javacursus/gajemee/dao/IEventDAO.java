package nl.javacursus.gajemee.dao;

import java.util.List;

import nl.javacursus.gajemee.model.Event;

public interface IEventDAO {

	List<Event> findAll();

	public Event findEvent(String eventName);

}
