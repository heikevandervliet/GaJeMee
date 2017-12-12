package nl.javacursus.gajemee.dao;

import java.util.ArrayList;
import java.util.List;

import nl.javacursus.gajemee.model.Categories;
import nl.javacursus.gajemee.model.Event;

public class EventDAO {

	private static List<Event> events = new ArrayList<>();
	
	static {
		events.add(new Event("spelletjesavond", "30 december", "20:30", "Utrecht", Categories.SPELLEN, true, 11));
		
	}
	
	
}
