import java.util.Scanner;

public class odev24 {
    public static void main(String[] args) {
        int i, n, k, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayisini Giriniz:");
        n = input.nextInt();

        for (i = 1; i <= n; i++) {

            for (k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }

        for (i = n - 1; i > 0; i--) {

            for (k = n - i; k > 0; k--) {
                System.out.print(" ");
            }

            for (j = (2 * i) - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}