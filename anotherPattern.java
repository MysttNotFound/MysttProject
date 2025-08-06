public class anotherPattern {
    public static void main(String[] args){
        //forUpperHalf
        int n=4;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
           }
           for(int j=0;j<2*(n-i);j++){
            System.out.print(" ");
           }
           for(int j=0;j<=i;j++){
            System.out.print("*");
           }
           System.out.println();
        }
        //forLowerHalf
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<=2*n;j++){
                System.out.print(" ");
            }
             for(int j=0 ; j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
