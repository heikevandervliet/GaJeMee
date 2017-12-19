package nl.javacursus.gajemee.model;

import static org.assertj.core.api.Assertions.setMaxLengthForSingleLineDescription;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String userName;
	//private String email;
	//private String passWord;
	//private Coordinates coordinates;
	private LocalDate birthday;
	//private LocalDate creationProfile;
	//private boolean loggedOn;
	private static List <Categories> preferences = new ArrayList<>();
	
	public Profile(String name, LocalDate birthday){
		this.userName = name;
		this.birthday = birthday;
		setDefaultList();
	}
	
	public void setDefaultList() {
		for(Categories a: Categories.values()) {
			preferences.add(a);
		}
	}
	
		
	public static List<Categories> getPreferences() {
		return preferences;
	}

	public static void setPreferences(List<Categories> preferences) {
		Profile.preferences = preferences;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

}
