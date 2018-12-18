import java.util.Scanner;

public class LiczbyPierwsze {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n;
        n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            int liczba = scanner.nextInt();
            boolean pierwsza = CzyLiczbaJestPierwsza(liczba);

            if (pierwsza){
                System.out.println("TAK");
            }else {
                System.out.println("NIE");
            }
        }

    }

    private static boolean CzyLiczbaJestPierwsza(int n){
        if (n < 2){
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
