import java.util.HashMap;
import java.util.Map;

public class learnHashMap {
    public static void main(String[] args) {
        
    Map<String , Integer> numbers = new HashMap<>();
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three",3);

    if(!numbers.containsKey("Two")){
    numbers.put("Two", 73);
    }

    numbers.putIfAbsent("Four", 4);
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