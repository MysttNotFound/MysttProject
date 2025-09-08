import java.util.Scanner; 
    public class reverseOrderUsingBacktracking {
    
        
    
    static void print(int i , int n){
        if (i>n) {
            return;
        }
            print(i+1,n);
            System.out.println(i);
           
 
        
    }
    


            
        
    
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
        
    }
}
    

