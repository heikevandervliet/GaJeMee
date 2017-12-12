package nl.javacursus.gajemee.model;

import java.time.LocalDate;

public class Profile {

	private String userName;
	private String email;
	private String passWord;
	private String userLocation;
	private LocalDate birthday;
	private LocalDate creationProfile;
	private boolean loggedOn;

	public Profile() {

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

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
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

}
