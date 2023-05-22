package BasicSyntaxConditionalStatementsLoopsMoreExercise_01;

import java.util.Scanner;

public class SortNumbers_01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%d\n%d\n%d", a, b, c);
            } else {
                System.out.printf("%d\n%d\n%d", a, c, b);
            }
        } else if (b > c && b > a) {
            if (a > c) {
                System.out.printf("%d\n%d\n%d", b, a, c);
            } else {
                System.out.printf("%d\n%d\n%d", b, c, a);
            }
        } else if (c > a && c > b) {
            if (a > b){
                System.out.printf("%d\n%d\n%d",c,a,b);
            }else {
                System.out.printf("%d\n%d\n%d",c,b,a);
            }
        }

    }
}

