import java.util.Scanner;

public class PerevodChisla {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = 0;
        int b = 1;
        while (n > 0) {
            d += (n % 10) * b;
            b *= 2;
            n /= 10;
        }
        System.out.println(d);
    }
}
