import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s"; 

        do {
            System.out.println("Calculadora de Rendimento ");

        
            System.out.print("Digite o valor do investimento inicial (P): R$ ");
            double p = scanner.nextDouble();

            System.out.print("Digite a taxa de juros anual (em %): ");
            double r = scanner.nextDouble();

            System.out.print("Digite o tempo de investimento (em anos): ");
            int t = scanner.nextInt();

            scanner.nextLine(); 
            System.out.print("Escolha o tipo de capitalização (simples ou composta): ");
            String tipo = scanner.nextLine().toLowerCase();

            double montante = 0;

         
            if (tipo.equals("simples")) {
                montante = calcularSimples(p, r, t);
            } else if (tipo.equals("composta")) {
                montante = calcularComposta(p, r, t);
            } else {
                System.out.println(" Tipo de capitalização inválido. Tente novamente.");
                continue;
            }

          
            System.out.printf(" Montante final após %d anos: R$ %.2f%n", t, montante);

         
            System.out.print("Deseja fazer outro cálculo? (s/n): ");
            continuar = scanner.nextLine().toLowerCase();

        } while (continuar.equals("s"));

        System.out.println("👋 Programa encerrado. Até a próxima!");
        scanner.close();
    }

   
    public static double calcularSimples(double p, double r, int t) {
        return p * (1 + (r / 100) * t);
    }

    public static double calcularComposta(double p, double r, int t) {
        return p * Math.pow(1 + (r / 100), t);
    }
}
