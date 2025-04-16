import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int senha = 1234;
        int senhaDigitada;

        System.out.println("Digite a senha");
        senhaDigitada = scanner.nextInt();

        while (senhaDigitada != senha)
        {
            System.out.println("Senha incorreta, tente novamente.");
            System.out.println("Digite a senha");
            senhaDigitada = scanner.nextInt();
        }
        System.out.println("Acesso concedido.");
        scanner.close();
    }
}
