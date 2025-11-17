
public class Pattern2 {

    public static void main(String[] args) {
        patt(5);

    }

    static void patt(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = row; col < row + n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
