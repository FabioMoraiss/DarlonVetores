/* Escrever um algoritmo que gere a seguinte matriz:
 
1 1 1 1 1 1 1
1 9 9 9 9 9 1
1 9 9 9 9 9 1
1 9 9 9 9 9 1
1 9 9 9 9 9 1
1 9 9 9 9 9 1
1 1 1 1 1 1 1
 
 */

package matizes.ExerciciosDeFixacao;

import matizes.matrix;

public class exercicio1 {
    public static void main(String[] args) {

        // criar a matriz
        int[][] galinha = new int[7][7];

        galinha = preencherGalinha(galinha);
        matrix.exibirMatriz(galinha);

    }

    public static int[][] preencherGalinha(int[][] vaca) {

        for (int i = 0; i < vaca.length; i++) {
            for (int j = 0; j < vaca[0].length; j++) {
                if (i == 0 || i == vaca.length - 1 || j == 0 || j == vaca[0].length - 1) {
                    vaca[i][j] = 1;
                } else {
                    vaca[i][j] = 9;
                }
            }
        }

        return vaca;
    }
}
