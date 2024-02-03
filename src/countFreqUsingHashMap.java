import java.util.HashMap;

public class countFreqUsingHashMap {

    public static void main(String[] args) {
        int [] input= {1,2,3,7};
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if(hash.containsKey(input[i])){
                hash.put(input[i],hash.get(input[i])+1);
            }else{
                hash.put(input[i],1);
            }
        }

        System.out.println(hash);
    }
}
