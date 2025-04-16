import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota;
        double soma = 0;
        int quantidade = 0;
        String continuar;

        do {
            System.out.print("Digite uma nota (0 a 10): ");
            nota = scanner.nextDouble();

            
            if (nota >= 0 && nota <= 10) {
                soma += nota;         
                quantidade++;         
            } else {
                System.out.println("Nota inválida. Digite um valor entre 0 e 10.");
            }

            System.out.print("Deseja inserir outra nota? (s/n): ");
            scanner.nextLine();  
            continuar = scanner.nextLine();

        } while (continuar.equalsIgnoreCase("s"));

       
        if (quantidade > 0) {
            double media = soma / quantidade;
            System.out.printf("A média das notas é: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }

        scanner.close();
    }
}
