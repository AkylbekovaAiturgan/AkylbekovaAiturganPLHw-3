import java.util.Scanner;

public class Zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (in.nextInt() == 0) {
                c++;
            }
        }
        System.out.println(c);
    }
}

