public class NumStarsPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++){
            for (int j = 1; j <=n-i; j++) {
                System.out.print(j);
            }
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            for (int j = i; j<n; j++) {
                System.out.print(n-j);
            }
            System.out.println();
        }
    }
}
/* OUTPUT
12345**54321
1234****4321
123******321
12********21
1**********1
*/