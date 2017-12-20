package nl.javacursus.gajemee.dao;

import java.util.List;

import nl.javacursus.gajemee.model.Profile;

public interface IProfileDAO {

	public List<Profile> findAll();

	public Profile findOne(int profileID);

	public abstract Profile findProfile(String name);

}
