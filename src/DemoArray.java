import java.util.Arrays;

public class DemoArray {

    public static void main(String[] args) {
        int[] arr = {1,34,65,89,2};
/*
        for (int j : arr) {
            //System.out.println(j);
        }
*/
        System.out.println("Max "+ Arrays.stream(arr).max().getAsInt());
        System.out.println("Min "+ Arrays.stream(arr).min().getAsInt());
        Arrays.sort(arr);
/*
        for (int j : arr) {
           System.out.println(j);
        }
*/
        System.out.println("Second Min "+arr[1]);
        System.out.println("Second max "+arr[arr.length-2]);

    }
}
