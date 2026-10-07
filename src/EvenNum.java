import java.util.Scanner;

public class EvenNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();

        for (int x=a; x<=b; x++) {
            if (x%2==0) {
                System.out.print(x + " ");
            }
        }
    }
}
