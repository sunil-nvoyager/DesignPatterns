import java.util.ArrayList;
import java.util.List;

public class Proxy {
    StudentDao studentDao = new StudentDaoImpl();
    public Student enroll(Student student, Role role) {
        try {
            validateRole(role);
            studentDao.enroll(student);
            return studentDao.getStudentInfo(student.getId());
        } catch (Exception e) {
            System.out.println("Not permitted or wrong data");
        }
        return null;
    }

    public boolean remove(String id, Role role) {
        try {
            validateRole(role);
            return studentDao.remove(id);
        } catch (Exception e) {
            System.out.println("Not permitted or wrong data");
        }
        return false;
    }

    public Student update(Student student, Role role) {
        try {
            validateRole(role);
            return studentDao.update(student);
        } catch (Exception e) {
            System.out.println("Not permitted or wrong data");
        }
        return null;
    }

    public Student getStudentInfo(String id, Role role) {
        try {
            Student student = studentDao.getStudentInfo(id);
            Student student1 = new Student(student.getName(), student.getDOB());
            if (checkRole(role)) {
                student1.setId(null);
            }
            return student1;
        } catch (Exception e) {
            System.out.println("Not permitted or wrong data");
        }
        return null;
    }

    public List<Student> getAllStudentInfo(Role role) {
        List<Student> studentList = studentDao.getAllStudentsInfo();
        if (checkRole(role)) {
            List<Student> studentList1 = new ArrayList<>();
            for (Student student : studentList) {
                Student student1 = new Student(student.getName(), student.getDOB());
                student1.setId(null);
                studentList1.add(student1);
            }
            studentList = studentList1;
        }
        return studentList;
    }

    private void validateRole(Role role) throws Exception {
        if (role.equals(Role.STUDENT)) {
            throw new Exception("This is not permitted");
        }
    }

    private boolean checkRole(Role role) {
        return !role.equals(Role.TEACHER);
    }
}
