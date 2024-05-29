public class Student implements Comparable<Student>{
    private int studentId;
    private String firstName;
    private String secondName;
    private String name;

    public Student(int studentId, String firstName, String secondName, String name) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(studentId, o.getStudentId());
    }
}
