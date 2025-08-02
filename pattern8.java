public class pattern8 {
    public static void main(String[] args){
        int n = 4;
        for(int i = 0; i < n; i++) {
            // print leading spaces
            for(int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // print stars
            for(int k = 0; k < (2*n - 1 - 2*i); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
