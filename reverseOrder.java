import java.util.Scanner;
public class reverseOrder {
    static void print(int i , int n){
        if (i<1) {
            return;
        }
            System.out.println(i);
            print(i-1,n);
           
 
        
    }
    


            
        
    
    public static void main(String[] args) {
        
        System.out.println("Enter the value of n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n,n);
        
    }
}
    

