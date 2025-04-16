public class App {
    public static void main(String[] args) throws Exception {
        int[] numeros = {5, 8, 2, 4, 7, 1, 9, 3, 6, 10};
        int soma = 0;

        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
    }
        System.out.println("A soma dos elementos do vetor é: " + soma);
}
}
