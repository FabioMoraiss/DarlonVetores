public class exercicio24 {
    public static void main(String[] args) {

        // sorteia a quantidade de produto em estoque
        int estoqueN = sorteio.sorteiaNumero(2, 8);

        // cria a matriz com com estoqueN linhas, e 4 colunas
        // 4 colunas pois cada produto(linha) tem 4 informaçoes(colunas) nome, valor, quantidade, saldo
        String[][] estoque = new String[estoqueN][4];


        //preenche o estoque com as informaçoes
        estoque = preencherEstoque(estoque);

        //exibe o estoque de forma bonitinha
        mostrarMatriz(estoque);

    }

    public static String[][] preencherEstoque(String[][] n) {


        String[][] retorno = new String[n.length][n[0].length];

        //o for que percorre as linhas
        for (int i = 0; i < n.length; i++) {

            //for que percorre as colunas
            for(int j= 0; j<n[0].length; j++) {
                switch(j){

                    //na linha i, coluna 0, é o nome do produto
                    case 0:
                    retorno[i][j] =sorteio.sorteiaString(sorteio.sorteiaNumero(5, 8));
                    break;

                    //na linha i, coluna 1, é o preço
                    case 1:
                    retorno[i][j] = String.valueOf(sorteio.sorteiaPreco(0.99, 5000));
                    break;

                    //na linha i, coluna 2 é quantidade 
                    case 2:
                    retorno[i][j] = String.valueOf(sorteio.sorteiaNumero(0, 200));
                    break;

                    //na linha i, coluna 3, é o saldo
                    case 3:
                    retorno[i][j] = String.valueOf(Integer.valueOf(retorno[i][2]) * Double.valueOf(retorno[i][1]));

                }
            }
        }

        return retorno;

    }

    //a matriz não ta bonita, mas eu fiz o meu melhor
    public static void mostrarMatriz(String[][] n) {
        System.out.println("Índices\t| Produto\t| Valor Unitário\t| Quantidade\t| \tSaldo");
        System.out.println("------------------------------------------");

        for (int i = 0; i < n.length; i++) {
            System.out.print("   " + i + "\t| ");
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(n[i][j]);

                // Tabulação para alinhar as colunas
                if (j != n[i].length - 1) {
                    System.out.print("\t\t| ");
                }
            }
            System.out.println();
        }
    }

}
