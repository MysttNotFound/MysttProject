import java.util.Map;
import java.util.TreeMap;

public class learnTreeMap {
    public static void main(String[] args) {
        
    Map<String , Integer> numbers = new TreeMap<>();
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three",3);

    if(!numbers.containsKey("Two")){
    numbers.put("Two", 73);
    }

    numbers.putIfAbsent("Four", 4);

    numbers.remove("Three");
    System.out.println(numbers);

    System.out.println(numbers.containsValue(3));
    System.out.println(numbers.containsKey("Three"));

    for(Map.Entry<String , Integer> e : numbers.entrySet()){
        System.out.println(e);

         System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
   
    }
}