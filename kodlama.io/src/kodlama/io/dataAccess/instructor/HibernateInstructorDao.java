package kodlama.io.dataAccess.instructor;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("Jbbs ile veritabanina eklendi. " + instructor.getFirstName());
    }
}
