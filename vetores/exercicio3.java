/*Elaborar um programa que leia um vetor C de 10 elementos inteiros. 
Após o término da leitura, trocar todos os valores negativos do vetor C por 0.
 Após todas as trocas terem sido efetuadas, escrever o novo vetor C. */

public class exercicio3 {
    public static void main(String[] args) {
        int[] bolinhoDeArroz = new int[10];

        //prencher o arry com valors de -100 até 0;
        bolinhoDeArroz = array.preencherArrayInt(bolinhoDeArroz, -100, 100);
        array.preencherArrayDouble(null, 0, 0);

        //exibe o vetor da primra vez
        array.exibirArray(bolinhoDeArroz); 

        // pula linha
        System.out.println(); 

        // faz a lógica do exerciccio
        bolinhoDeArroz = regradoExercicio(bolinhoDeArroz); 

        // exibe o vetor que o exercicio pede
        array.exibirArray(bolinhoDeArroz); 


    }

    public static int[] regradoExercicio(int[] bolinho) {

         // criei um novo array como tamanho do array passado por parametro
        int[] arroz = new int[bolinho.length];

        for(int i =0; i<arroz.length; i++) { //for pra percorrer o vetor arroz

            //condição do exerciccio
            if(bolinho[i] < 0) { 
                arroz[i] = 0;
            } else { 
                arroz[i] = bolinho [i];
            }
        }

        return arroz;
    }
}
