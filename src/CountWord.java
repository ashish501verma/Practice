import java.util.Scanner;

public class CountWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String input= sc.nextLine();
        int count=0;
        for (int i=1;i<=input.length()-1;i++){
            if(Character.isSpaceChar(input.charAt(i))){
                count++;
            }
        }
        System.out.println(count+1);
    }
}
