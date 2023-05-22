package BasicSyntaxConditionalStatementsLoopsMoreExercise_01;

import java.util.Scanner;

public class ReverseString_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        for (int i = message.length() - 1; i >= 0; i--) {
            char letter = message.charAt(i);
            String result = "";
            result = result + letter;
            System.out.print(result);
        }
    }
}
