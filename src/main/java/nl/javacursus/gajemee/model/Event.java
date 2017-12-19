package nl.javacursus.gajemee.model;

import java.time.*;

public class Event {

	private String eventName;
	private LocalDate date;
	private Categories category;
	
	
	// is de counter bij aanmaak van het event Object
	// eventID = lijst van events.lengte +1

	
	public Event() {
	}
	

	public Event(String eventName, LocalDate date, Categories category) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.category = category;
	}



	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public LocalDate getLocalDate() {
		return date;
	}

	public void setLocalDate(LocalDate date) {
		this.date = date;
	}


	public Categories getCategory() {
		return category;
	}

	public void setCategory(Categories category) {
		this.category = category;
	}

	
}
