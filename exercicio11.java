/* Elaborar um programa que receba do usuário dois vetores, A e B, com 10 números inteiros cada. 
Crie um novo vetor denominado C calculando C=A−B. Mostre na tela os dados do vetor C. */

public class exercicio11 {
    public static void main(String[] args) {

        //cria os vetors
        int[] vetorA = new int[10];
        int[] vetorB = new int[10];
        int[] vetorC = new int[10];

        //preenche A e B
        vetorA = array.preencherArrayInt(vetorA);
        vetorB = array.preencherArrayInt(vetorB);


        //prrenche C com a regra do exercicio
        vetorC = preencherArrayRegra(vetorC, vetorA, vetorB);


        //exibe os vetores
        texto.escreva("Vetor A:");
        array.exibirArray(vetorA);
        texto.pulaLinha();

        texto.escreva("Vetor B:");
        array.exibirArray(vetorB);
        texto.pulaLinha();

        texto.escreva("Vetor C:");
        array.exibirArray(vetorC);

        
    }

    public static int[] preencherArrayRegra(int[] c, int[] a, int[] b) {

        //percorre o vetor C
        for(int i =0; i<c.length; i++) {
            
            //vetor C na pocisao i, recebe a, na posicao i  MENOS b na posicao i
            c[i] = a[i] - b[i];
        }
        
        return c;
    }
}
