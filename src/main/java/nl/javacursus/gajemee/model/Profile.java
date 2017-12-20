package nl.javacursus.gajemee.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Profile {

	private String userName;
	private String email;
	private String passWord;
	// private Coordinates coordinates;
	private LocalDate birthday;
	private LocalDate creationProfile;
	private boolean loggedOn;
	private List<Categories> preferences = new ArrayList<>();

	public Profile(String name, LocalDate birthday, String email, String passWord) {
		this.userName = name;
		this.birthday = birthday;
		this.email = email;
		this.passWord = passWord;
		setDefaultList();
	}

	public void setDefaultList() {
		for (Categories a : Categories.values()) {
			preferences.add(a);
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public LocalDate getCreationProfile() {
		return creationProfile;
	}

	public void setCreationProfile(LocalDate creationProfile) {
		this.creationProfile = creationProfile;
	}

	public boolean isLoggedOn() {
		return loggedOn;
	}

	public void setLoggedOn(boolean loggedOn) {
		this.loggedOn = loggedOn;
	}

	public List<Categories> getPreferences() {
		return preferences;
	}

	public void setPreferences(List<Categories> preferences) {
		this.preferences = preferences;
	}

}
