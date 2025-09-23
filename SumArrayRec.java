package Class;
import java.util.Scanner;
public class SumArrayRec {
        public static int findTotalCoins(int[] coins, int index) {

            if (index >= coins.length) {
                return 0;
            }

            return coins[index] + findTotalCoins(coins, index + 1);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int n = scanner.nextInt();

            int[] coins = new int[n];
            for (int i = 0; i < n; i++) {
                coins[i] = scanner.nextInt();
            }


            int totalSum = findTotalCoins(coins, 0);

            System.out.println(totalSum);

            scanner.close();
        }
    }