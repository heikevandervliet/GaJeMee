package nl.javacursus.gajemee.dao;

import java.util.ArrayList;
import java.util.List;
import nl.javacursus.gajemee.model.*;
import java.time.*;

public class ProfileDAO {
	
	private static List<Profile> profiles = new ArrayList<>();
	private int profileID;
	
	static {
		profiles.add(new Profile("Heike van der Vliet", "heikevandervliet@hotmail.com", "geheim", new Coordinates(36.386, -127.441406), LocalDate.of(1985, 11, 11)));
		profiles.add(new Profile("Esther", "esther@apekop.nl", "12345", new Coordinates(-127.324, 35.3678), LocalDate.of(1986, 9, 05)));
		profiles.add(new Profile("Jan", "jan@clicknet.nl", "password", new Coordinates(52.2390773, 4.7939868), LocalDate.of(1991, 3, 18)));
	}
	
	
	public Profile findProfile(String name) throws NullPointerException{
		for (Profile i: profiles) {
			if (i.getUserName().equals(name)) {
				return i;
			}
			else {
				throw new NullPointerException ("Profile not Found");
				}
		}
		return null;
		
	}

}
