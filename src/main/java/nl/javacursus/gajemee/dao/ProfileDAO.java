package nl.javacursus.gajemee.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nl.javacursus.gajemee.model.Profile;

@Repository
public class ProfileDAO implements IProfileDAO {

	private static List<Profile> profiles = new ArrayList<>();

	public List<Profile> findAll() {
		return this.profiles;
	}

	static {
		profiles.add(new Profile("Heike", LocalDate.of(1985, 11, 11), "heikevandervliet@hotmail.com", "geheim"));
		profiles.add(new Profile("Esther", LocalDate.of(1986, 9, 05), "esther@apekop.nl", "123"));
		profiles.add(new Profile("Jan", LocalDate.of(1991, 3, 18), "jan@clicknet.nl", "password"));
	}

	public Profile findProfile(String name) throws NullPointerException {
		for (Profile i : profiles) {
			if (i.getUserName().equals(name)) {
				return i;
			} else {
				throw new NullPointerException("Profile not Found");
			}
		}
		return null;

	}

	@Override
	public Profile findOne(int profileID) {
		return profiles.get(profileID);
	}

}
