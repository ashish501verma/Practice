import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<Integer> hash = new HashSet<>();

        hash.add(10);
        hash.add(20);
        hash.add(30);
        hash.add(90);
        hash.add(70);

        System.out.println(hash);
        //System.out.println(hash.size());
       // System.out.println(hash.stream().count());
        Iterator<Integer> iterator = hash.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }

}
