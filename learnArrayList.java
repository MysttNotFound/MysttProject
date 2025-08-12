import java.util.ArrayList;
public class learnArrayList{

    public static void main(String[] args){

        // ArrayList<String> studentName = new ArrayList<>();
        // studentName.add("Anshuman");

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
       
        
        //addingAnotherArrayUsingArrayList
         
         list.add(4);
         System.out.println(list);

         //addingParticularElementsAtParticularIndexes

         list.add(1, 50);
         System.out.println(list);

         ArrayList<Integer>newList = new ArrayList<>();
         newList.add(120);
         newList.add(130);

         list.addAll(newList);

         System.out.println(list);

        //  System.out.println(list.get(4));

        // list.remove(1);
        //  System.out.println(list);

        // list.remove(Integer.valueOf(3));
        // System.out.println(list);

        // list.clear();
        // System.out.println(list);

        // list.set(1 , 1000);
        // System.out.println(list);
        

        // System.out.println(list.contains(10));
        for(int i=0;i<list.size();i++){
            System.out.println("the List Is" + " " + list.get(i));
        }
       }
}
