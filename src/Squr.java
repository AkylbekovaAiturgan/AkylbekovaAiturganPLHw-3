import java.util.Scanner;

public class Squr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for (int i=a; i<=b; i++) {
            int x = (int) Math.sqrt(i);

            if (x*x==i) {
                System.out.print(i + " ");
            }
        }
    }
}