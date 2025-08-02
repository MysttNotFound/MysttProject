public class pattern12 {
    public static void main(String[] args){
        int n=4;
         for(int i=1 ; i<=n;i++){
            // forLeftSidePattern
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            
        

        // forSpace
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
               

            }
            
        
        // forRightSidePattern
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
         System.out.println();
        }
        
    }
}
       
