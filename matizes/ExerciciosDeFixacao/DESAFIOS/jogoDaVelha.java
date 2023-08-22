package matizes.ExerciciosDeFixacao.DESAFIOS;

import matizes.matrix;
import utilidades.texto;
import vetor.array;

public class jogoDaVelha {
    public static void main(String[] args) {
        int ganhador = -1;
        boolean estaAcabado = true;
        texto.escreva("bem vindo jogador !");
        texto.pulaLinha();

        String[][] velha = { { "#", "#", "#" }, { "#", "#", "#" }, { "#", "#", "#" } };

        String[][] jogo = new String[3][3];
        jogo = preencherJogo(jogo);
        texto.pulaLinha();
        texto.escreva(" O JOGO COMEÇOU ");

        while (estaAcabado) {
            imprimirJogo(jogo);
            jogardor1(jogo);

            if (isganho(jogo)) {
                ganhador = 1;
                break;

            }

            imprimirJogo(jogo);
            jogardor2(jogo);
            if (isganho(jogo)) {
                ganhador = 2;
                break;
            }
        }

        texto.pulaLinha();
        texto.escreva("o ganhador foi o jogador " + ganhador);

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

    /

    public static boolean isganho(String[][] jogo) {

        for (int i = 0; i < jogo.length; i++) {
            if (isLinhIgual(i, jogo)) {
                return true;
            }
            if (isColunaIgual(i, jogo)) {
                return true;
            }

        }
        return false;
    }

    public static boolean isLinhIgual(int i,String[][] jogo) {
        for(int j=0; j<jogo.length; j++) {
            if(jogo[][])
        }
     }

    public static boolean isColunaIgual(int i,String[][] jogo) {
        String[] coluna = matrix.getColunaString(jogo, i);

        String caractere1= "X";
        String caractere2 = "O";

        if(array.arrayIgualElemento(coluna, caractere1))

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
                imprimirJogo(jogo);
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
