package kodlama.io;



import kodlama.io.business.CourseManager;
import kodlama.io.core.logging.DatabaseLogger;
import kodlama.io.core.logging.FileLogger;
import kodlama.io.core.logging.Logger;
import kodlama.io.core.logging.MailLogger;
import kodlama.io.dataAccess.course.HibernateCourseDao;
import kodlama.io.dataAccess.course.JdbcCourseDao;
import kodlama.io.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new MailLogger()};

//      Instructor instructor = new Instructor("Galip", "Dogan");
//      InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
//      InstructorManager instructorManager1 = new InstructorManager(new JdbcInstructorDao(), loggers);
//      instructorManager.add(instructor);

      Course course = new Course();
      course.setName("Java Egitimi");
      //course.setUnitPrice(0);
      CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
      CourseManager courseManager1 = new CourseManager(new JdbcCourseDao(), loggers);
      courseManager.add(course);
      courseManager1.add(course);


//      Category category = new Category();
//      category.setName("Java");
//      CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
//      CategoryManager categoryManager1 = new CategoryManager(new JdbcCategoryDao(), loggers);
//      categoryManager.add(category);
	}

}
