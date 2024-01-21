import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class StudentDaoImpl implements StudentDao {
    HashMap<String, Student> studentHashMap = new HashMap<>();
    @Override
    public Student enroll(Student student) {
        studentHashMap.put(student.getId(), student);
        return student;
    }

    @Override
    public boolean remove(String id) {
        if (!studentHashMap.containsKey(id)) {
            return false;
        }
        studentHashMap.remove(id);
        return true;
    }

    @Override
    public Student update(Student student) {
        if (!studentHashMap.containsKey(student.getId())) {
            return null;
        }
        studentHashMap.remove(student.getId());
        studentHashMap.put(student.getId(), student);
        return student;
    }

    @Override
    public Student getStudentInfo(String id) throws Exception {
        if (id == null || !studentHashMap.containsKey(id)) {
            throw new Exception("Enter a valid id");
        }
        return studentHashMap.get(id);
    }
    @Override
    public List<Student> getAllStudentsInfo() {
       return Optional.ofNullable(studentHashMap)
               .map(map -> new ArrayList<>(map.values()))
               .orElse(null);
    }
}
