package nl.javacursus.gajemee.dao;

import java.util.ArrayList;
import java.util.List;
import nl.javacursus.gajemee.model.*;
import java.time.*;

public class ProfileDAO implements IProfileDAO {

	private static List<Profile> profiles = new ArrayList<>();
	private int profileID;
	
	public List<Profile> findAll(){
		return this.profiles;
	}
	
	
	static {
		profiles.add(new Profile("Heike", LocalDate.of(1985, 11, 11)));
		profiles.add(new Profile("Esther", LocalDate.of(1986, 9, 05)));
		profiles.add(new Profile("Jan", LocalDate.of(1991, 3, 18)));
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
