import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int soma = 0;
        System.out.println("Digite um numero");
        numero = scanner.nextInt();
        
            while(numero >= 0){
                soma += numero;
                System.out.println("Digite outro numero");
                numero = scanner.nextInt();
            }
            System.out.println("Soma total dos numeros digitados" + soma);
            scanner.close();
    }
}
