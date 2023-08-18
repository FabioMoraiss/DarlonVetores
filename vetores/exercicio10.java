/*Elaborar um programa com um vetor de tamanho 50 preenchido com o seguinte valor: 
(i+5i)%(i+1)
 sendo i a posição do elemento no vetor. Em seguida imprima o vetor na tela. */

public class exercicio10 {
    public static void main(String[] args) {

        //cria o vetor
        int[] star5 = new int[50];

        //preence de acordo com a regra
        star5 = preenhcerVetorRegra(star5);

        //exibe o vetor
        array.exibirArray(star5);   
    }

    public static int[] preenhcerVetorRegra(int[] vetor) {

        //for para percorrer o vetor
        for(int i =0; i<vetor.length; i++) {
            vetor[i] = (i + 5 * i) % (i +1);
        }

        return vetor;
    }
}
