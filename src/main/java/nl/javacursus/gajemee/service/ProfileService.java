package nl.javacursus.gajemee.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import nl.javacursus.gajemee.model.*;
import nl.javacursus.gajemee.dao.*;

public class ProfileService implements IProfileService {
	
	@Autowired
	private IProfileDAO iProfileDAO;
	
	public List<Profile> findAll(){
		return this.iProfileDAO.findAll();
	}

}
