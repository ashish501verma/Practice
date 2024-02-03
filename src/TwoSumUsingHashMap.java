import java.util.HashMap;

public class TwoSumUsingHashMap {

    public static void main(String[] args) {
        int [] ip ={1,2,3,4,5,6,7,8,9,10,0};
        int target=11;
        int diff=0;
//        for (int i = 0; i < ip.length; i++) {
//            for (int j = 0; j < ip.length; j++) {
//                if(ip[i]+ip[j]==target){
//                    System.out.println(ip[i]+","+ip[j]);
//                }
//            }
//        }
        HashMap<Integer,Integer> hashMap= new HashMap<>();
        for (int i = 0; i < ip.length; i++){
            if(hashMap.containsKey(ip[i])){
                hashMap.put(ip[i],hashMap.get(ip[i])+1);
            }else{
                hashMap.put(ip[i],1);
            }
            // diff=target- ip[i];
            if(hashMap.keySet().contains(target- ip[i])){
                System.out.println(ip[i] +","+ (target- ip[i]));
            }
        }

    }
}
