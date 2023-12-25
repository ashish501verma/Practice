import java.util.Scanner;

public class charoccurance {

    public static void main(String[] args) {

            Scanner sc= new Scanner(System.in);
            System.out.println("Enter String");
            String input= sc.nextLine();
        System.out.println("Enter char");
            String c= sc.next();
            int count=0;
            for (int i=1;i<=input.length()-1;i++){
                if(c.equalsIgnoreCase(String.valueOf(input.charAt(i)))){
                    count++;
                }
            }
            System.out.println(count);

    }
}
