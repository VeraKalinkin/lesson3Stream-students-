import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>, Comparable<Stream>{
    private List<StudentGroup> studentGroupList;

    public Stream(List<StudentGroup> studentGroupList){
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void addStudentGroup(StudentGroup studentGroup){
        studentGroupList.add(studentGroup);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(getStudentGroupList());
    }

    @Override
    public int compareTo(Stream o) {
        return Integer.compare(studentGroupList.size(), o.getStudentGroupList().size());
    }

    @Override
    public String toString() {
        return "Stream{ " + studentGroupList.size() + " group(s)" +
                " studentGroupList = " + studentGroupList +
                '}' +"\n";
    }
}
