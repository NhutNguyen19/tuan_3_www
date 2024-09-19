package vn.edu.iuh.fit.processing;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import vn.edu.iuh.fit.entity.Student;

import java.util.List;

public class StudentProcessing {

    @PersistenceContext(unitName = "crud")
    private EntityManager entityManager;

    public void addStudent(String name, String email){
        Student student = new Student();
        student.setName(name);
        student.setEmail(email);
        entityManager.persist(student);
    }

    public List<Student> getAllStudents(){
        TypedQuery<Student> query = entityManager.createQuery("select s from Student s", Student.class);
        return query.getResultList();
    }

    public Student listStudentById(int id){
        TypedQuery<Student> query = entityManager.createQuery("select s from Student s where s.id = :id", Student.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }
}
