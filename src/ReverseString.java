import com.sun.corba.se.impl.orbutil.CorbaResourceUtil;

public class ReverseString {
    public static void main(String[] args) {
       // System.out.println("Hello");

        String s1= "NITIN";
     /*   char[] c= s1.toCharArray();
        StringBuffer sb= new StringBuffer(s1);
        sb.reverse();
        if(s1.equalsIgnoreCase(sb.toString()))
        {
            System.out.println("True");
        }

      */
        String s2= "";
       // for (int i=0;i<s1.length();i++){
        for (int i=s1.length()-1;i>=0;i--){
            s2+=s1.charAt(i);
        }
        System.out.println(s1);
        System.out.println(s2);
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Palindrom");
        }
    }
}
