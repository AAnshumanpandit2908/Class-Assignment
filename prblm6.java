package Class;

import java.util.Scanner;

public class prblm6{

    public static int countWays(int n) {

        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return countWays(n - 1) + countWays(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ways = countWays(n);
        System.out.println(ways);

        scanner.close();
    }
}
