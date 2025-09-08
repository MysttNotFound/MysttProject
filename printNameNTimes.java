import java.util.Scanner;
public class printNameNTimes {
static void  print(int i , int n){
if (i>n) {
    return;
    
}
System.out.println("Anshuman");
print(i+1,n);
  }
    public static void main(String[] args) {
        System.out.println("Enter the value for n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(1,n);
        

    }
}

