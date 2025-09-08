public class recursion1{
    static void print(int count){
        if (count == 3) {
            return;
        }
        System.out.println(count);
        count = count + 1;
        print(count);
    }
    
    public static void main(String[] args){
        print(4);
    }
}
