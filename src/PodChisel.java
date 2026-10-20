import java.util.Scanner;

public class PodChisel {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = 0, p = 0, neg = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x == 0) {
                z++;
            } else if (x > 0) {
                p++;
            } else {
                neg++;
            }
        }
        System.out.println(z + " " + p + " " + neg);
    }
}
