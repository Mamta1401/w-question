import java.util.*;

public class spaceDiamond2 {

    public static Scanner scn = new Scanner (System.in);

    public static void starSpace(int n){
        int nst = (n/2) + 1;
        int nsp = 1;
        for (int row = 1; row <= n; row++){
            for (int cst = 1; cst <= nst; cst++){
            System.out.print("*\t");
        }
        for (int csp = 1; csp <= nsp; csp++){
            System.out.print("\t");
        }
        for (int cst = 1; cst <= nst; cst++){
            System.out.print("*\t");
        }
        if (row <= (n / 2)){
            nsp += 2;
            nst--;
        } 
        else{
            nsp -= 2;
            nst++;
        }
        System.out.println("\t");
    }
}
    public static void main(String[] args){
        starSpace(scn.nextInt());

    }
}
