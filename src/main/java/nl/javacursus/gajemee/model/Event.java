package nl.javacursus.gajemee.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Event {

	private String eventName;
	private LocalDate date;
	private LocalTime time;
	private Coordinates coordinates;
	private Categories category;
	private boolean attend = true;
	private String message;

	// is de counter bij aanmaak van het event Object
	// eventID = lijst van events.lengte +1

	public Event() {
	}

	public Event(String eventName, LocalDate date, LocalTime time, Coordinates coordinates, Categories category,
			String message) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.time = time;
		this.coordinates = coordinates;
		this.category = category;
		this.message = message;

	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	public boolean isAttend() {
		return attend;
	}

	public void setAttend(boolean attend) {
		this.attend = attend;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
