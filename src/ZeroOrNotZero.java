import java.util.Scanner;

public class ZeroOrNotZero{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 0) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
