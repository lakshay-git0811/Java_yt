public class BasicPatterns {
    public static void main(String[] args) {
        // solid rectangle
        int r = 4;
        int c = 5;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(("*"));
            }
            System.out.println();
        }
    }
}
