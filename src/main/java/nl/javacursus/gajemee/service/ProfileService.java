package nl.javacursus.gajemee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nl.javacursus.gajemee.dao.IProfileDAO;
import nl.javacursus.gajemee.model.Profile;

@Service
public class ProfileService implements IProfileService {

	@Autowired
	private IProfileDAO iProfileDAO;

	public List<Profile> findAll() {
		return this.iProfileDAO.findAll();
	}

	@Override
	public Profile findOne(int profileID) {

		return this.iProfileDAO.findOne(profileID);
	}

}
