import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(2, "Abc", "bbb", "nnn");
        Student student1 = new Student(1, "Dbc", "ccc", "mm");
        Student student2 = new Student(3, "Brw", "ttt", "dd");

        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.addStudent(student);
        studentGroup.addStudent(student1);

        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>());
        studentGroup1.addStudent(student2);

        Stream ProjectManagers = new Stream(new ArrayList<>());
        ProjectManagers.addStudentGroup(studentGroup);
        ProjectManagers.addStudentGroup(studentGroup);

        Stream Analysts = new Stream(new ArrayList<>());
        Analysts.addStudentGroup(studentGroup1);

        StreamService streamService = new StreamService(new ArrayList<>());
        streamService.addStream(Analysts);
        streamService.addStream(ProjectManagers);
        System.out.println(streamService.getSortedStreams());

    }
}