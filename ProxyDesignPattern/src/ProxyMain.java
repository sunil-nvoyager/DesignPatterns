import java.util.List;

public class ProxyMain {
    public static void main(String[] args) {
        Student student1 = new Student("Farhan", "07-01-1999");
        Student student2 = new Student("Ahmad", "01-07-1999");
        Student student3 = new Student("SRK", "07-02-1997");
        Student student4 = new Student("Thala", "16-08-1998");

        Proxy proxy = new Proxy();

        student1 = proxy.enroll(student1, Role.TEACHER);
        print(student1);

        student3 = proxy.enroll(student3, Role.TEACHER);
        print(student3);

        student4 = proxy.enroll(student4, Role.TEACHER);
        print(student4);

        System.out.println();
        printAll(proxy.getAllStudentInfo(Role.TEACHER));

        print(proxy.enroll(student2, Role.STUDENT));
        student2 = proxy.enroll(student2, Role.TEACHER);
        print(student2);

        System.out.println();
        printAll(proxy.getAllStudentInfo(Role.TEACHER));
        System.out.println();
        printAll(proxy.getAllStudentInfo(Role.STUDENT));

        student3.setName("Shah Rukh Khan");
        print(proxy.update(student3, Role.STUDENT));
        print(proxy.update(student3, Role.TEACHER));
        System.out.println();
        printAll(proxy.getAllStudentInfo(Role.TEACHER));
        System.out.println();
        print(proxy.getStudentInfo(student1.getId(), Role.TEACHER));
        print(proxy.getStudentInfo(student1.getId(), Role.STUDENT));


        System.out.println(proxy.remove(student2.getId(), Role.STUDENT));
        System.out.println(proxy.remove(student2.getId(), Role.TEACHER));

        printAll(proxy.getAllStudentInfo(Role.TEACHER));
    }

    private static void print(Student student) {
        if(student == null) {
            System.out.println("NULL");
            return;
        }
        System.out.println("NAME: " + student.getName() + ",DOB: " + student.getDOB() + ",ID: " + student.getId());
    }

    private static void printAll(List<Student> students) {
        if(students == null || students.isEmpty()) {
            System.out.println("NULL");
            return;
        }
        for (Student student : students) {
            print(student);
        }
    }
}