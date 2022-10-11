package kodlama.io.dataAccess.course;

import kodlama.io.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		// TODO Auto-generated method stub
		System.out.println("Jbbs ile veritabanina eklendi. " + course.getName());
	}

}
