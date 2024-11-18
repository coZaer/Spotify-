package student;

public interface StudentService {
    void add(Student student);
    void update(int id,String name,int age);
    void delete(int id);
    Student getStudent(int id);

}
