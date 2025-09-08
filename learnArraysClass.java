import java.util.Arrays;

public class learnArraysClass {

    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(number, 4);
        System.out.println("The index of the particular number is " + index);



        Integer [] numbers = {1,67,8,9,4,3,5,63,89,21};
        Arrays.sort(numbers);
        
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }
}