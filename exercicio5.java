/*Leia um vetor A, com 10 elementos. Crie em vetor B da seguinte forma:
coloque os números pares primeiro;
coloque os números ímpares logo após os pares;
exiba o vetor B. */

public class exercicio5 {
    public static void main(String[] args) {
        //criar os arrys
        int[] gato = new int[10];
        int[] cachorro = new int[gato.length];
        
        //preenche o array
        gato = array.preencherArrayInt(gato);

        //exibe o vertor sem order
        System.out.println("vetor sem ordem");
        array.exibirArray(gato);
        System.out.println();

        //exebi o vetor com pares na frente
        cachorro = arrumarArray(gato);
        System.out.println("vetor com pares na frente");
        array.exibirArray(cachorro);
    }

    public static int[] arrumarArray(int[] papagaio) {

        int[] novoArray = new int[papagaio.length];
        
        /*o contador PROGRESSIVO começa do inicio do array (de frete pra tras)
        o contadodor REGRESSIVO começa do final do array( de traz pra frente)
        tem que ter o (-1) porque um array de 10 posições, vai de 0 a 9. então o contador REGRESSIVO vai começar de 10 - 1 = 9
         */
        int contadorPROGRESSIVO = 0;
        int contadorREGRESSIVO = novoArray.length -1;

        for(int i =0; i<novoArray.length; i++) {//percorrer o novo array

            if(papagaio[i] % 2 == 0) {
                novoArray[contadorPROGRESSIVO] = papagaio[i];
                contadorPROGRESSIVO ++;
            } else {
                novoArray[contadorREGRESSIVO] = papagaio[i];
                contadorREGRESSIVO --;
            }
        }
        return novoArray;
    }
}
