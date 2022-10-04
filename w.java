import java.util.*;

public class w {

    public static Scanner scn = new Scanner(System.in);

    public static void wPattern(int n) {
        int nst = n;
        for (int row = 1; row <= n; row++) {

            for (int cst = 1; cst <= nst; cst++) {
                if (cst == 1 || cst == n) {
                    System.out.print("*\t");
                }

                else if (row > (n / 2) && (row == cst || row + cst == n + 1)) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }

    public static void main(String[] args) {
        wPattern(scn.nextInt());
    }
}
