public class exercicio13 {
    public static void main(String[] args) {

        //cria um array bidimensional(matriz)
        //cada linha representa o numero do aluno
        //cada coluna, a altura do respesctivo aluno
        double[][] alunos = new double[10][2];

        alunos = preencherAlunos(alunos);

        exibirTabela(alunos);
        System.out.println();

        consultaRegra(alunos);



    }

    public static double[][] preencherAlunos(double[][] n) {

        for(int i =0; i<n.length; i++) {
            for(int j=0; j<n[0].length; j++) {
                switch(j) {
                    case 0:
                    n[i][j] = sorteio.sorteiaNumero(5, 200);
                    break;

                    case 1:
                    n[i][j] = sorteio.altura();
                    break;
                }
            }
        }

        return n;
    }

    public static void exibirTabela(double[][] array) {
        

        System.out.println("Índice | numero | altura");
        System.out.println("----------------------");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%6d | %4.0f | %5.2f%n", i, array[i][0], array[i][1]);
        }
    }

    public static void consultaRegra(double[][] array) {
        double[][] maisAlto = {{0, 0.1}};
        double[][] maisBaixo = {{0, 99999}};


        for(int i = 0; i<array.length; i++) {
            for(int j=1; j<array[0].length; j ++) {
                if(array[i][j] > maisAlto[0][1]) {
                    maisAlto[0][1] = array[i][j];
                    maisAlto[0][0] = array[i][0];
                }

                if(array[i][j] < maisBaixo[0][1]){
                    maisBaixo[0][1] = array[i][j];
                    maisBaixo[0][0] = array[i][0];
                }
            }
        }

        System.out.println(" aluno mais alto | numero | altura");
        System.out.println("----------------------");
        System.out.printf(" \t\t| %4.0f | %5.2f%n", maisAlto[0][0], maisAlto[0][1]);
        texto.pulaLinha();

        System.out.println(" aluno mais baixo | numero | altura");
        System.out.println("----------------------");
        System.out.printf(" \t\t| %4.0f | %5.2f%n", maisBaixo[0][0], maisBaixo[0][1]);



    }
}
