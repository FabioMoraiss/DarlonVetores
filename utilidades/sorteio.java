package utilidades;

import java.util.Random;

public class sorteio {
    public static Random random = new Random();

    public static int sorteiaNumero(int mim, int max) {
        int valorMax = max;
        int valorMim = mim;
        int range = valorMax - valorMim + 1;
        int aletorio = (int) ((Math.random() * range) + valorMim);

        return aletorio;

    }

    public static int sorteiaNumero() {
        int valorMax = 999;
        int valorMim = -999;
        int range = valorMax - valorMim + 1;
        int aletorio = (int) ((Math.random() * range) + valorMim);

        return aletorio;

    }

    public static String sorteiaString(int n) {

        // Defina os caracteres que podem ser utilizados na string aleatória
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Inicialize o gerador de números aleatórios
        Random random = new Random();

        // Crie um StringBuilder para construir a string aleatória
        String vazia = "";

        // Adicione caracteres aleatórios ao StringBuilder até que ele atinja o tamanho
        // N
        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            vazia += characters.charAt(index);

        }

        // Retorne a string aleatória gerada
        return vazia;
    }

    public static double sorteiaPreco(double mim, double max) {
        double valorMax = max;
        double valorMim = mim;
        double numeroDeCasasDecimais = 2.0;
        double casas = Math.pow(10, numeroDeCasasDecimais);
        double range = valorMax - valorMim + 1;

        double aletorio = ((Math.random() * range) + valorMim);

        double numeroTruncado = (Math.floor(aletorio * casas) / casas);

        return numeroTruncado;

    }

    public static double altura() {
        double alturaMaxima = 2;
        double alturaMinima = 1;
        double numeroDeCasasDecimais = 2;
        double casas = Math.pow(10, numeroDeCasasDecimais);
        double range = alturaMaxima - alturaMinima;

        double aleatorio = ((Math.random() * range) + alturaMinima);
        double truncado = (Math.floor(aleatorio * casas) / casas);

        return truncado;
    }

}
