package kodlama.io.business;

import kodlama.io.core.logging.Logger;
import kodlama.io.dataAccess.course.CourseDao;
import kodlama.io.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	private Logger[] loggers;

	private Course[] courses;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
//	       for (Course course1:courses){
//	           if (course1.getName().equals(course.getName())){
//	               throw new Exception("Kurs daha onceden kayitli!");
//	           }else if (course1.getUnitPrice()<0){
//	               throw new Exception("Kurs fiyati 0(sifir) dan kucuk olmaza!");
//	           }
//	       }

		if (course.getUnitPrice() < 0.0) {
			throw new Exception("Kurs fiyati 0(sifir) dan kucuk olmaza!");
		}
		courseDao.add(course);
		for (Logger logger : loggers) {// once database sonra mail yollandin
			logger.log(course.getName());
		}
	}
}
