public class rightFacedTriangle {
    public static void main(String[] args){
        int row = 3;
        //upperHalfOfTheTriangle

        for(int i=0; i<=row; i++){
            for(int j=0 ; j<i+1;j++){
             System.out.print("*");
            }
            System.out.println();
        }

        // lowerHalfOfTheTriangle

        for(int i = 0 ; i<=row+1; i++){
            for(int j=0 ; j<=row-i+1;j++){
                System.out.print("*");
             }
            System.out.println();
        }
    }
    
}
