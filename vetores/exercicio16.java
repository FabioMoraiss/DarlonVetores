/*Use um vetor unidimensional para resolver o seguinte problema. Leia 20 números, 
todos situados entre 0 e 100, inclusive. À medida que cada número for lido, 
imprima-o somente se não for duplicata de um número já lido. Experimente o "pior caso", 
no qual todos os 20 números são diferentes.

 */

import utilidades.texto;

public class exercicio16 {
    public static void main(String[] args) {
        //cria o vetor do meu exercicio com 20 posicoes
        int[] abacaxi = new int[20];


        texto.escreva("Bem vindo usuario, digite os numeros ai");

        //for para varrer o meu vetor
        for(int i = 0; i<abacaxi.length; i++) {
            
            //pede ao usuario para digitar o numero
            System.out.print("digite o numero " + i + ": ");

            //coloca o numero em uma variavel efemera/temporaria
            int efemero = texto.inputInt();

            //confere se o numero efemero esta dentro do vetor
            if(exercicio7.estaContidoNoVetor(abacaxi, efemero)){
                //se tiver, nao faz nada
            } else {

                //se não estiver, avisa ao usuario
                texto.escreva("o numero " + efemero + " não estava no vetor");
                texto.pulaLinha();
            }

            //coloca o numero efemero dentro do vetor
            abacaxi[i] = efemero;

        }
    }
}

/* eu coloquei o numero digitado em uma variavel efefera, pois se colocar dentro do vetor direto,
 * o exercicio nao da certo, experimente vocë mesmo :)
 * se o numero já esta dentro do vetor, a funcao estaContidoNoVetor sempre vai retornar verdadeiro !
 */
