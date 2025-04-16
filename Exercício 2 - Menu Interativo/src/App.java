import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar");
            System.out.println("2. Remover");
            System.out.println("3. Sair");
            System.out.println("4. Sair");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Adicionado com sucesso.");
            } else if (opcao == 2) {
                System.out.println(" Removido com sucesso.");
            } else if (opcao == 3) {
                System.out.println("Saindo...");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
