public class App {
    public static void main(String[] args) throws Exception {
        int contador = 2;
        int anterior = 0;
        int atual = 1;

        System.out.print(anterior + ", " + atual);

            while(contador < 10){
                int proximo = anterior + atual;
                System.out.print(", " + proximo);
                anterior = atual;
                atual = proximo;
                contador++;
            }
    }
}
