package nl.javacursus.gajemee.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nl.javacursus.gajemee.model.Categories;
import nl.javacursus.gajemee.model.Event;

@Repository
public class EventDAO implements IEventDAO {

	private static List<Event> events = new ArrayList<>();
	// private int eventID;

	public List<Event> findAll() {
		return this.events;
	}
	// =index in ArrayList.

	static {
		events.add(new Event("Spelletjesavond", LocalDate.of(2017, 12, 30), Categories.SPELLEN));
		events.add(new Event("Bowlen", LocalDate.of(2017, 12, 31), Categories.SPORTIEF));
		events.add(new Event("Saunabezoek", LocalDate.of(2018, 01, 05), Categories.ONTSPANNING));

	}

	public Event findEvent(String eventName) throws NullPointerException {
		for (Event i : events) {
			if (i.getEventName().equals(eventName)) {
				return i;
			} else {
				throw new NullPointerException("Event not found.");
			}
		}
		return null;

	}

	public ArrayList<Event> findPreferences(Enum Categories) throws NullPointerException {
		ArrayList<Event> foundEvents = new ArrayList<>();
		for (Event i : events) {
			if (i.getCategory().equals(Categories)) {
				foundEvents.add(i);
			} else {
				throw new NullPointerException("No events found.");
			}
		}
		return foundEvents;

	}

	/*
	 * public ArrayList findEventsOnDate(LocalDate date) throws NullPointerException
	 * { ArrayList <Event> foundEvents = new ArrayList<>(); for (Event i : events) {
	 * if (i.getLocalDate().compareTo(date)) { foundEvents.add(i); } else { throw
	 * new NullPointerException("No events found."); } } return foundEvents;
	 * 
	 * }
	 */

}
