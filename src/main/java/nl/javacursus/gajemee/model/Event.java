package nl.javacursus.gajemee.model;

public class Event {

	private String eventName;
	private String date; // convert time?
	private String time; // Hoe van een vaste vorm? Hoe fouten in invoer onderscheppen?
	private String location; // google maps?
	private Categories category;
	private boolean attend = true;

	// is de counter bij aanmaak van het event Object
	// eventID = lijst van events.lengte +1

	private int eventID;
	
	public Event() {
	}
	
	

	public Event(String eventName, String date, String time, String location, Categories category, boolean attend,
			int eventID) {
		super();
		this.eventName = eventName;
		this.date = date;
		this.time = time;
		this.location = location;
		this.category = category;
		this.attend = attend;
		this.eventID = eventID;
	}



	public int getEventID() {
		return eventID;
	}

	public void setEventID(int eventID) {
		this.eventID = eventID;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
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

	
}
