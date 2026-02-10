import java.util.Scanner;

public class praktikumPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input NIM: ");
        long nim = sc.nextLong();
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        for (int i = 1; i < n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            }
            if (i % 2 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            }
        }
    }
}
