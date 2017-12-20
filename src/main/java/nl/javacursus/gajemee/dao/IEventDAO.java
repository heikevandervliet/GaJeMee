package nl.javacursus.gajemee.dao;

import nl.javacursus.gajemee.model.*;
import java.util.ArrayList;
import java.util.List;

public interface IEventDAO {

	List<Event> findAll();

	public Event findEvent(String eventName);

}
