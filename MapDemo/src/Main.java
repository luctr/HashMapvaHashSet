import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("nam", 20, "hn");
        Student student2 = new Student("linh", 30, "hn");
        Student student3 = new Student("trang", 19, "hn");
        Student student4 = new Student("tran", 25, "hn");

        Map<Integer , Student > studentMap = new HashMap<>();
        studentMap.put(1,student1);
        studentMap.put(2,student2);
        studentMap.put(3,student3);
        studentMap.put(1,student4);

        for (Map.Entry<Integer, Student> student : studentMap.entrySet())
            System.out.println(student.toString());
        
        System.out.println("............Set");
        Set<Student> students = new HashSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student1);
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
