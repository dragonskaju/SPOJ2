import java.util.Scanner;

public class DwieCyfrySilni {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int w = scanner.nextInt();
        int s = scanner.nextInt();

        Silnia(s,w);

    }

    public static int Silnia(int s,int w){
        for (int i = 1; i <= s; i++){
            w *= i;
            System.out.println("Wynik: " + w);
        }
        return w;
    }

}
