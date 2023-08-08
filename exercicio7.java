/*Elaborar um programa que leia um vetor com 20 números inteiros.
Escreva os elementos do vetor eliminando elementos repetidos. */

public class exercicio7 {
    public static void main(String[] args) {

        //cria um novo array
        int[] goku = new int[20];

        //preenche com numeros aleatórios entre 1 e 6
        goku = array.preencherArrayInt(goku, 1, 6);
        
        //exibe o array sem regras
        array.exibirArray(goku);
        System.out.println();

        //exibe o arry de acordo com as regras do exercicio
        exibirVetorcomRegras(goku);

    }

    public static void exibirVetorcomRegras(int[] vegeta) {
        //cria um array VAZIO, do mesmo tamanho do recebido por parametro
        int[] numerosRepitidos = new int[vegeta.length];

        //percorre o vetor recebido por paremetro
        for (int i = 0; i < vegeta.length; i++) {

            //verifica se o numero da vez, está contido no vetor numerosRepitidos
            if (estaContidoNoVetor(numerosRepitidos, vegeta[i])) {
                // se o numero estiver contido NÃO FAZ NADA
            } else {
                //se o numero não estiver contido, exibe ele, e bota esse numero dentro do vetor dos repitidos
                System.out.print(vegeta[i] + " | "); 
                numerosRepitidos[i] = vegeta[i];

                // o " | " é só pra visualização ficar bonita, oque importa é o vegeta[i]
            }
        }
    }

    //função que vai receber o vetor repitido e o numero para comparação
    public static boolean estaContidoNoVetor(int[] freeza, int Gonhan) {

        //percorre o vetor dos numeros repidos
        for (int i = 0; i < freeza.length; i++) {
            
            //tenta achar o numero na posicao I dentro do vetor dos repitidos
            if (freeza[i] == Gonhan) {
                return true;
            }
        }

        //se não achar, retorna falso
        return false;

    }
}
