package nl.javacursus.gajemee.service;

import java.util.List;
import java.util.ArrayList;
import nl.javacursus.gajemee.dao.*;
import nl.javacursus.gajemee.model.*;

public interface IEventService {
	
	List<Event> findAll();

}
