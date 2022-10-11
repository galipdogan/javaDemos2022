package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.instructor.InstructorDao;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	 private InstructorDao instructorDao;
	    private Logger[] loggers;
	    private Instructor[] instructors;

	    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
	        this.instructorDao = instructorDao;
	        this.loggers = loggers;
	    }

	    public void add(Instructor instructor) throws Exception {

	        instructorDao.add(instructor);
	        for (Logger logger : loggers) {// once database sonra mail yollandin
	            logger.log(instructor.getFirstName());
	        }
	    }
	}
