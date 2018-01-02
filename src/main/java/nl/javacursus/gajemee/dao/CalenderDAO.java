package nl.javacursus.gajemee.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import nl.javacursus.gajemee.model.Calender;

@Repository
public class CalenderDAO implements ICalenderDAO {

	private static List<Calender> calenders = new ArrayList<>();

	@Override
	public List<Calender> findAll() {

		return calenders;
	}

	static {
		calenders.add(new Calender("naam",2018));
		calenders.add(new Calender("betere naam", 2007));
	}

}
