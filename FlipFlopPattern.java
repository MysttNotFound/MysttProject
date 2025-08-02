public class FlipFlopPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int start;

            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(start);
                // Flip the value: 1 becomes 0, 0 becomes 1
                if (start == 1) {
                    start = 0;
                } else {
                    start = 1;
                }
            }

            System.out.println();
        }
    }
}
