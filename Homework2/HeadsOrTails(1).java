import java.util.Random;
import java.util.Scanner;

public class Coin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Enter the number of throws:");
        int coin = 0;

        try {
            coin = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Enter correct number!");
            System.exit(0);
        }

        if (coin <= 0) {
            System.out.println("Incorrect input!");
        } else {
            int i = 0;
            int headCount = 0;
            int tailCount = 0;

            while (i < coin) {
                int num = random.nextInt();
                if (num % 2 == 0) {
                    headCount++;
                } else {
                    tailCount++;
                }
                i++;
            }

            System.out.println("There are " + headCount + " heads and " + tailCount + " tails.");
        }
    }
}
