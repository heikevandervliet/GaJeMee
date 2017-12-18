package nl.javacursus.gajemee.dao;

import java.time.*;
import java.util.ArrayList;
import java.util.List;

import nl.javacursus.gajemee.model.*;

public class EventDAO {

	private static List<Event> events = new ArrayList<>();
	private int eventID;
	// =index in ArrayList.

	static {
		events.add(new Event("Spelletjesavond", LocalDate.of(2017, 12, 30), LocalTime.of(20, 30),
				new Coordinates(10.0, 10.0), Categories.SPELLEN, "Ik wil graag Mysterium met jullie spelen!"));
		events.add(new Event("Bowlen", LocalDate.of(2017, 12, 31), LocalTime.of(20, 00), new Coordinates(15.0, 15.0),
				Categories.SPORTIEF, "Lekker bowlen!"));
		events.add(new Event("Saunabezoek", LocalDate.of(2018, 01, 05), LocalTime.of(11, 15),
				new Coordinates(50.0, 50.0), Categories.ONTSPANNING, "Toe aan een dagje niksen:)"));

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

	public ArrayList findPreference(Enum Categories) throws NullPointerException {
		ArrayList <Event> foundEvents = new ArrayList<>();
		for (Event i : events) {
			if (i.getCategory().equals(Categories)) {
				foundEvents.add(i);
			} else {
				throw new NullPointerException("No events found.");
			}
		}
		return foundEvents;

	}
	
	public ArrayList findEventsOnDate(LocalDate date) throws NullPointerException {
		ArrayList <Event> foundEvents = new ArrayList<>();
		for (Event i : events) {
			if (i.getLocalDate().compareTo(date)) {
				foundEvents.add(i);
			} else {
				throw new NullPointerException("No events found.");
			}
		}
		return foundEvents;

	}

	
}
