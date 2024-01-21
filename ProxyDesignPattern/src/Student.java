import java.util.UUID;

public class Student {
    private String name;
    private String DOB;
    private String id = UUID.randomUUID().toString();

    public Student(String name, String DOB) {
        this.name = name;
        this.DOB = DOB;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
