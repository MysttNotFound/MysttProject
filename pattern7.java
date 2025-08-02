public class pattern7 {
    public static void main(String[] args){
        int n = 4;

        for (int i = 0; i < n; i++) {
            // print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // print stars
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
