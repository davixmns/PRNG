package davi;

public class Algoritmo1Davi {
    public long calcular(long numero){
        if(numero <= 99){
            return numero;
        }
        return calcular(numero / 2);
    }

    public long processar(long numero){
        long chave = calcular(numero);
        return calcular(chave);
    }

}
