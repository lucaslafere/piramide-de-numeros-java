import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número a obter a pirâmide de números");
        int numeroLinhasPiramide = scanner.nextInt();
        for (int i = 1; i <= numeroLinhasPiramide; i++){
            System.out.println(String.valueOf(i).repeat(i));
        }
        
    }
}
