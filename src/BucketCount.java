public class BucketCount {

    public static void main(String[] args) {
        String str="Ashish";
        int count=0;
        //char[] cr =  {'A','S','H','I','S','H'};
       // System.out.println(cr);
        int[] arr= new int[26];
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }
            arr[i]=count;
            System.out.println(arr[i]);
            count=0;
            }
        }
    }

