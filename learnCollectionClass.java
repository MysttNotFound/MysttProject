import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class learnCollectionClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(29);
        list.add(30);
        list.add(32);
        list.add(12);

        System.out.println("Minimum element is " + Collections.min(list));
        System.out.println("Minimum element is " + Collections.max(list));
        System.out.println( Collections.frequency(list, 23));


    Collections.sort(list);
    System.out.println(list);

    Collections.sort(list , (Comparator.reverseOrder()));
    System.out.println(list);
    }
    
}
