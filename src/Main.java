import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        ArrayList<Integer> numerosUsados = new ArrayList<>();
        LCG lcg = new LCG();

        int valorMinino = 0;
        int valorMaximo = 100;

        int numeroGerado = lcg.randomInt(valorMinino, valorMaximo);
        numerosUsados.add(numeroGerado);

        for (int i = 0; i < 5; i++) {
            while (numerosUsados.contains(numeroGerado)) {
                numeroGerado = lcg.randomInt(valorMinino, valorMaximo);
            }
            numerosUsados.add(numeroGerado);
        }

        for (int numero : numerosUsados) {
            System.out.print(numero + " ");
        }
    }
}