package nl.javacursus.gajemee.dao;

import nl.javacursus.gajemee.model.*;
import nl.javacursus.gajemee.service.*;
import nl.javacursus.gajemee.web.*;
import nl.javacursus.gajemee.dao.*;

import java.util.List;
import java.util.ArrayList;


public interface IProfileDAO {
	
	public List<Profile> findAll();
	public abstract Profile findProfile(String name);

}
