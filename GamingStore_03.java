package BasicSyntaxConditionalStatementsLoopsMoreExercise_01;

import java.util.Scanner;

public class GamingStore_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = Double.parseDouble(scanner.nextLine());

        String command = scanner.nextLine();

        double currentBalance = balance;
        double sumPriceGames = 0;
        boolean isOutOfMoney = false;

        while (!command.equals("Game Time")) {
            double priceGame = 0;
            switch (command) {
                case "OutFall 4":
                    priceGame = 39.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                case "CS: OG":
                    priceGame = 15.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                case "Zplinter Zell":
                    priceGame = 19.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                case "Honored 2":
                    priceGame = 59.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                case "RoverWatch":
                    priceGame = 29.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                case "RoverWatch Origins Edition":
                    priceGame = 39.99;
                    if (currentBalance < priceGame) {
                        System.out.println("Too Expensive");
                        command = scanner.nextLine();
                        continue;
                    }
                    currentBalance = currentBalance - priceGame;
                    System.out.printf("Bought %s\n", command);
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }
            if (currentBalance <= 0) {
                isOutOfMoney = true;
                break;
            }
            sumPriceGames += priceGame;
            command = scanner.nextLine();
        }

        if (isOutOfMoney) {
            System.out.println("Out of money!");
        } else {
            System.out.printf("Total spent: $%.02f. Remaining: $%.02f", sumPriceGames, currentBalance);
        }
    }
}
