
public class Pattern1 {

    public static void main(String[] args) {
        patt1(5);

    }

    static void patt1(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
