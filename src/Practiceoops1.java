import jdk.nashorn.internal.parser.JSONParser;

public class Practiceoops1 {
    public static void main(String[] args) {
        Person person=new Person("Ashish ",25);
        System.out.println("Name: "+ person.name +"Age: "+ person.age);
        person.setName("Vikas");
        person.setAge(28);
        System.out.println("Name: "+ person.getName() +" Age: "+ person.getAge());
    }

}
class Person{
    String name;
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;

    }
}
