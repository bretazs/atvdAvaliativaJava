import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Digite um numero inteiro positivo");
        int numero =  scanner.nextInt();

        if(numero < 0){
            System.out.println("O numero e invalido, Digite um numero posotivo");
        }else{
            int fatorial = 1;
            
            for(int i = 1; i <= numero; i++){
                fatorial *= i;
            }
            System.out.println("O fatorial de "  + numero  +  " é: " + fatorial);
        }
        scanner.close();
    }
}
