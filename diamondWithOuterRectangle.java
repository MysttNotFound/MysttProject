public class diamondWithOuterRectangle {
    public static void main(String[] args){
        int n=4;
        // forUpperLeftHalf
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                    
                
                System.out.print("*");
            }

     //forSpaces

        for(int j=0;j<=2*i;j++){
            System.out.print(" ");
        }
        
        //forUpperRightHalf
     
      for(int j=0;j<=n-i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
     for(int i=0;i<=n;i++){
        //forLowerLeftHalf

        for(int j=0;j<=i;j++){
            System.out.print("*");
        }

        //forSpaces
        for(int j=0;j<=2*(n-i);j++){
            System.out.print(" ");
        }

        //forLowerRightHalf

        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    } 
}
}    
