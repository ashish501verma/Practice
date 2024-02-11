import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(21);
        list.add(22);
        list.add(23);
        list.add(24);
        list.add(25);
        // for stream we have two method filter and map filer we use to print and map we use to modify.
        list.stream().filter(i->i>21).forEach(System.out::println);

        List<Integer> collect = list.stream().collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> collect1 = list.stream().filter(i -> i > 24).collect(Collectors.toList());
        System.out.println(collect1);

        //map to modify the value object
        list.stream().map(i->i+100).forEach(System.out::println);


        Optional<Integer> max = list.stream().max(((o1, o2) -> o1.compareTo(o2)));

        System.out.println(max);
    }

}
