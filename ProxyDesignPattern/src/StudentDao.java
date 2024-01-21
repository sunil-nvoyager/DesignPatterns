
import java.util.List;

public interface StudentDao {
    Student enroll(Student student);
    boolean remove(String id);
    Student update(Student student);
    Student getStudentInfo(String id) throws Exception;

    List<Student> getAllStudentsInfo();
}
