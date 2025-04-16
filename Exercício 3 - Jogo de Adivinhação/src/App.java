import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random =  new Random();

        int numSorteado = random.nextInt(20) +1;
        int palpites;
        int tentativas = 0;

        System.out.println("Tente adivinhar o numero de 1 a 20");

        do{
            System.out.println("Adivinhe o numero");
            palpites = scanner.nextInt();
            tentativas++;

            if(palpites > numSorteado){
                System.out.println("O numero sorteado é menor que " + palpites);
            }else if(palpites < numSorteado){
                System.out.println("O numero sorteado e maior que " + palpites);
            }else{
                System.out.println("Parabens voce acertou o numero sorteado " + numSorteado + "!");
                System.out.println("Numero de tentativas " +  tentativas);;
            }
        }while(palpites != numSorteado);
        scanner.close();
    }
}
