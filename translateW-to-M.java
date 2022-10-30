import java.util.*;

public class table {

    public static Scanner scn = new Scanner(System.in);

    public static void tablePattern (int n) {
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + (n*i));
            i++;
        }
    }

    public static void main(String[] args) {
        tablePattern(scn.nextInt());
    }
}
