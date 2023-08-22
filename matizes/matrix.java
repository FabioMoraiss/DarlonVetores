package matizes;

import utilidades.sorteio;
import utilidades.texto;

public class matrix {

    public static void exibirMatriz(int[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                if (numeros3casanegativo(x[i][j])) {

                    System.out.print(x[i][j] + " ");

                } else if (numeroNegativo2casa(x[i][j]) || numeroPositivo3casas(x[i][j])) {

                    System.out.print(" " + x[i][j] + " ");

                } else if (numeroNegativo1casa(x[i][j]) || numeroPositivo2casas(x[i][j])) {

                    System.out.print(" " + " " + x[i][j] + " ");

                } else if (numeroPostivo(x[i][j])) {

                    System.out.print(" " + " " + " " + x[i][j] + " ");

                } else {
                    System.out.println("0000");
                }

            }
            System.out.println();

            // -200
            // n999
            // n-33
            // nn-2
            // nn99
            // nnn3
            // 0000
        }

    }

    public static int[][] preencherMatrizInt(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = sorteio.sorteiaNumero();
            }
        }

        return x;
    }

    public static boolean numeros3casanegativo(int x) {
        if (x < -100) {
            return true;
        }

        return false;
    }

    public static boolean numeroNegativo1casa(int x) {
        if (numeroNegativo(x) && x > -10) {
            return true;
        }

        return false;
    }

    public static boolean numeroNegativo2casa(int x) {
        if (numeroNegativo(x) && x > -100) {
            return true;
        }

        return false;
    }

    public static boolean numeroPositivo3casas(int x) {
        if (x > 100) {
            return true;
        }
        return false;
    }

    public static boolean numeroPositivo2casas(int x) {
        if (numeroPostivo(x) && x > 99) {
            return true;
        }

        return false;
    }

    public static boolean numeroNegativo(int x) {
        if (x < 0) {
            return true;
        }

        return false;
    }

    public static boolean numeroPostivo(int x) {
        if (x > 0) {

        }

        return true;
    }

    public static void imprimirMatrisString(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + " ");
            }
            texto.pulaLinha();
        }

    }

    public static String[] getColunaString(String[][] x, int coluna) {
        String[] vetor = new String[x.length];

        for(int i = 0; i<vetor.length; i++) {
            vetor[i] = x[i][coluna];
        }

        return vetor;
    }

    public static String[] getLinhaString(String[][] x,int linha) {
        String[] vetor = new String[x[0].length];

        for(int i =0; i<vetor.length; i++) {
            vetor[i] = x[linha][i];
        }

        return vetor;
    }

}
