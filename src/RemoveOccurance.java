import java.util.Scanner;

public class RemoveOccurance {
    public static void main(String[] args) {
        String s="Hey my Name is Anthony gonsalvish, main duniya me Akela hun!!";
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the char to remove");
        String c= sc.next();
        if(s.contains(c))
        {
            String s2=s.replace(c,"");
            System.out.println(s2);
        }
        System.out.println(s);



    }
}
