package Class;

public class ReverseRec {

    public static void printEcho(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");

        printEcho(n - 1);
    }

    public static void main(String[] args) {
        printEcho(9);
    }
}