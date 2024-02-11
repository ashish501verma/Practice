import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Students {
    int roll_no;
    String name;
    int marks;

    String course;

    public String getCourse() {
        return course;
    }

    public Students(int roll_no, String name, int marks, String course) {
        this.roll_no = roll_no;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "roll_no=" + roll_no +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", course='" + course + '\'' +
                '}';
    }

    public void setCourse(String course) {
        this.course = course;
    }

//    public Students(int roll_no, String name, int marks) {
//        this.roll_no = roll_no;
//        this.name = name;
//        this.marks = marks;
//    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


    public static void main(String[] args) {

List<Students> list= Arrays.asList(
        new Students(10,"Akki",99,"Math"),
        new Students(20,"Anshu",98,"English"),
        new Students(21,"Ashish",90,"English"),
        new Students(19,"Shubham",60,"Math"),
        new Students(4,"Lokesh",69,"Math")
);

        List<Students> collect = list.stream().sorted(Comparator.comparingInt(Students::getRoll_no))
                .collect(Collectors.toList());

        List<Students> collect1 = list.stream().sorted(((o1, o2) -> o1.name.compareToIgnoreCase(o2.getName())))
                .collect(Collectors.toList());
        long count = list.stream().count();



        System.out.println(collect); // sorted by roll no.
        System.out.println(collect1);// sorted by name
        System.out.println(count);
       // System.out.println(distinct);

    }
}
