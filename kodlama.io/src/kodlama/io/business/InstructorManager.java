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
//	        for (Instructor instructor1 : instructors) {
//	            if (instructor.getFirstName().equals(instructor1.getFirstName() ) ) {
//	                throw new Exception("Egitmen daha once kayitli!");
//	            }
//	        }
	        instructorDao.add(instructor);
	        for (Logger logger : loggers) {// once database sonra mail yollandin
	            logger.log(instructor.getFirstName());
	        }
	    }
	}