public class PatternDemo {
    public static void main(String[] args) {
        int n=19;
        /* down Piramid*/
//        for (int i=0;i<2;i++){
//            for (int j = 0; j < n; j++) {
//                if((i==0 && (j==0 ||j==n-1|| j==n/2)) || (i==1&&(j==(n/2)+1 || j==(n/2)) || j==(n/2)-1)){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("* ");
//                }
//
//            }
//            System.out.println();
//        }

        for (int i=0;i<n;i++){
        for (int k=0;k<i;k++){
            System.out.print(" ");
        }
            for (int j = n-i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
