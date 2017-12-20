package nl.javacursus.gajemee.service;

import java.util.List;

import nl.javacursus.gajemee.model.Profile;

public interface IProfileService {
	
	
	List <Profile> findAll();
	Profile findOne(int profileID);

}
