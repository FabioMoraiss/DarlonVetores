public class exercicio2 {
    public static void main(String[] args) {

        // inicia o vetor com 10 posições, de 0 a 9
        int[] vetorA = new int[10];
        int[] vetorB = new int[10]; 

        //você pode preencher os arrays A e B com os valores que desejar, se ficar mais facil de entender
        vetorA = array.preencherArrayInteiro(vetorA);
        vetorB = array.preencherArrayInteiro(vetorB);


        //exebir vetores
        array.exibirVetor(vetorA);
        array.exibirVetor(vetorB);

        //criar o vetor C com o tamanho de A +  tamanho de B
        int[] vetorC = new int[vetorA.length + vetorB.length];
        vetorC = preencherVetorC(vetorA, vetorB);

        array.exibirVetor(vetorC);

    }

    public static int[] preencherVetorC(int[] a, int[] b) {

        //criei o vetor que vai RETORNAR, com o tamanho do vetor A + o tamanho do vetor B
        int[] vetor = new int[a.length + b.length]; 

        for(int i = 0; i<a.length; i++) { //pode ser A ou B .length, mas só vai dar certo de A e B tiverem o mesmo tamanho
           
            
            vetor[i * 2] = a[i];

            vetor[(i * 2) +1] = b[i]; 
        }

        return vetor;

        /*
        os valores da posição X em A, sempre terão sua nova posição em C= x*2
        exemplo: A[0] = C[0];
        A[1] = C[2];
        A[2] = C[4];
        A[3] = C[6] 

        os valores da posição X em A, sempre terão sua nova posiçao em C = (x*2) + 1
        exemplo: B[0] = C[1];
        B[1] = C[3];
        B[2] = C[5];
        B[3] = C[7] 
        */


    }



}
