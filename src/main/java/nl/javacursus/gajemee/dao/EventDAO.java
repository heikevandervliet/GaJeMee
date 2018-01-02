package nl.javacursus.gajemee.dao;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import nl.javacursus.gajemee.model.Categories;
import nl.javacursus.gajemee.model.Coordinates;
import nl.javacursus.gajemee.model.Event;

@Repository
public class EventDAO implements IEventDAO {

	private List<Event> events = new ArrayList<>();
	// private int eventID;
	
	@Autowired
	private IProfileDAO iProfileDAO;

	public List<Event> findAll() {
		return this.events;
	}
	// =index in ArrayList.

	@PostConstruct
	 public void init(){
		events.add(new Event("Spelletjesavond", LocalDate.of(2017, 12, 30), LocalTime.of(20, 30),
				new Coordinates(10.0, 10.0), Categories.SPELLEN, "Ik wil graag Mysterium met jullie spelen!", this.iProfileDAO.findAll().get(0)));
		events.add(new Event("Bowlen", LocalDate.of(2017, 12, 31), LocalTime.of(20, 00), new Coordinates(15.0, 15.0),
				Categories.SPORTIEF, "Lekker bowlen!", this.iProfileDAO.findAll().get(1)));
		events.add(new Event("Saunabezoek", LocalDate.of(2018, 01, 05), LocalTime.of(11, 15),
				new Coordinates(50.0, 50.0), Categories.ONTSPANNING, "Toe aan een dagje niksen:)", this.iProfileDAO.findAll().get(2)));
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

	public ArrayList<Event> findEventsOnDate(LocalDate date) throws NullPointerException {
		ArrayList<Event> foundEvents = new ArrayList<>();
		for (Event i : events) {
			//if (i.getLocalDate().compareTo(date)) {
			if (date.equals(i.getDate())) {
				foundEvents.add(i);
			} else {
				throw new NullPointerException("No events found.");
			}
		}
		return foundEvents;

	}

}
