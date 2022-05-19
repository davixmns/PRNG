package davi;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class MainDavi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        JOptionPane painel = new JOptionPane();
//
//        String[] opcoes = {"1", "2"};
//
//        int escolha = JOptionPane.showOptionDialog(null,
//                "Digite o numero do algoritmo a utilizar",
//                "Escolha de Algoritmo",
//                JOptionPane.DEFAULT_OPTION,
//                JOptionPane.INFORMATION_MESSAGE,
//                null,
//                opcoes,
//                opcoes[0]
//        );

        int escolha = scanner.nextInt();
        if (escolha == 1) {
            Algoritmo1Davi alg = new Algoritmo1Davi();
            ArrayList<Long> lista = new ArrayList<>();

            long chave = alg.calcular(System.currentTimeMillis());
            for(int i = 0 ; i < 6; i++) {
                chave = alg.processar(chave);
                System.out.print(alg.calcular(chave) + " ");
            }
        } else {

        }

//        painel.showMessageDialog(null,
//                "teste",
//                "Números Sorteados",
//                JOptionPane.PLAIN_MESSAGE
//                );
    }
}
















