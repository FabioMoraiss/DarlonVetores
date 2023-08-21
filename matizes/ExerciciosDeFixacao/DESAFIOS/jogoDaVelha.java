package matizes.ExerciciosDeFixacao.DESAFIOS;

import matizes.matrix;
import utilidades.texto;

public class jogoDaVelha {
    public static void main(String[] args) {
        boolean estaAcabado = true;
        texto.escreva("bem vindo jogador !");
        texto.pulaLinha();

        String[][] jogo = new String[3][3];
        jogo = preencherJogo(jogo);
        texto.pulaLinha();
        texto.escreva(" O JOGO COMEÇOU ");

        while (estaAcabado) {
            imprimirJogo(jogo);
            jogardor1(jogo);
            imprimirJogo(jogo);
            jogardor2(jogo);
        }

    }

    public static String[][] preencherJogo(String[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                x[i][j] = "*";
            }
        }

        return x;
    }

    public static void imprimirJogo(String[][] jogo) {
        texto.pulaLinha();
        matrix.imprimirMatrisString(jogo);
        texto.pulaLinha();

    }

    public static void jogardor1(String[][] jogo) {
        boolean jogadaInvalida = true;
        while (jogadaInvalida) {
            texto.escreva("qual seu movimento ? JOGADOR 1 escreva a LINHA e a coluna");
            System.out.print("linha: ");
            int linha = texto.inputInt();
            System.out.print("coluna: ");
            int coluna = texto.inputInt();

            if (verificaPosicao(linha, coluna, jogo)) {
                jogo[linha][coluna] = "X";

                jogadaInvalida = false;
            } else {
                texto.escreva(" JOGADA INVALIDA ! BAKA");
            }
        }

    }

    public static void jogardor2(String[][] jogo) {
        boolean jogadaInvalida = true;
        while (jogadaInvalida) {
            texto.escreva("qual seu movimento ? JOGADOR 2 escreva a LINHA e a coluna");
            System.out.print("linha: ");
            int linha = texto.inputInt();
            System.out.print("coluna: ");
            int coluna = texto.inputInt();

            if (verificaPosicao(linha, coluna, jogo)) {
                jogo[linha][coluna] = "O";

                jogadaInvalida = false;
            } else {
                texto.escreva(" JOGADA INVALIDA ! BAKA");
            }
        }

    }

    public static boolean verificaPosicao(int linha, int coluna, String[][] jogo) {

        if (jogo[linha][coluna] != "*") {
            return false;
        }
        return true;

    }

}

// matriz 3x 3 com astericos
// um jogador é X o ou O, ou 0 e 1
// ganha quem fizer a mesma linha com o mesmo tipo de dado
