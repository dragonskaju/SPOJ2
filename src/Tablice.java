import java.util.Scanner;

public class Tablice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++){
            int n = scanner.nextInt();
            tab(t,n);
        }
    }

    public static int tab(int t, int n) {
        for (int i = t; i <= 100; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(n +  " ");
                return n;
            }
            return t;
        }
        return n;
    }
}