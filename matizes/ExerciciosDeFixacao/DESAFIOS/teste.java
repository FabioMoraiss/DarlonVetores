package matizes.ExerciciosDeFixacao.DESAFIOS;

public class teste {
    public static void main(String[] args) {
        // Crie uma matriz de 3 linhas por 3 colunas
int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

// Crie um vetor para armazenar os números da coluna
int[] vetor = new int[matriz.length];

// Percorra a matriz e adicione os números da coluna ao vetor
for (int i = 0; i < matriz.length; i++) {
  vetor[i] = matriz[i][0];
}

// Imprima o vetor

    }
}
