/*Elaborar um programa que leia um vetor de 10 posições. 
Contar e escrever quantos valores pares ele possui. */

public class exercicio8 {
    public static void main(String[] args) {

        //cria o array
        int[] chocolate = new int[10];
        
        //preenche o array com numero aleatorios
        chocolate = array.preencherArrayInt(chocolate, 1, 9);

        //exibe o arry sem regras 
        array.exibirArray(chocolate);
        System.out.println();

        //cria um contador paras numeros pares do arry
        int contadorPares = contarPares(chocolate);
    
        //exibe o numero do contador e os numeros pares
        System.out.println("o vetor tem: " + contadorPares + " numeros pares");
        exibirPares(chocolate);

        //exibe os numeros pares de maneira não repitida
        System.out.println();
        System.out.println("numeros pares não repididos são: ");
        exebirParesNaoRepitidos(chocolate);
    }
    public static int contarPares(int[] bombom) {

        //cria o contador começando em 0
        int contador =0;

        //percorre o array passado por paremetro
        for(int i = 0; i<bombom.length; i++) {

            //se o numero for par, incrementa o contador
            if(bombom[i] % 2 == 0) {
                contador++;
            }
        }
        return contador;
    }

    public static void exibirPares(int[] leiteCondesado) {

        //percorre o array recebido por parametro
        for(int i=0; i<leiteCondesado.length; i++) {

            //se o numero for par, exibe ele
            if(leiteCondesado[i] % 2 ==0) {
                System.out.print(leiteCondesado[i] + " ");
            }
        }
        System.out.println();
    }

    public static void exebirParesNaoRepitidos(int[] goiabada){
        //cria um array de numeros repidos, lembrando que o array começa com todos os numeros 0
        //o array tem o mesmo tamanho do passado por paremetro
        int[] repitidos = new int[goiabada.length];

        //percorre o array passado por parametro
        for(int i=0; i<goiabada.length; i++) {
            
            //verifica se o numero é par E se ele não está contido no vetor dos repidos
            if(goiabada[i] % 2 ==0 && !(exercicio7.estaContidoNoVetor(repitidos, goiabada[i]))) {

                //exibe o numero e coloca ele nos repidos depois
                System.out.print(goiabada[i] + " ");
                repitidos[i] = goiabada[i];
            }
            
            /* outra forma de escrevever esse if seria assim:

            if(goiabada[i] % 2 == 0){

                //verificase o numero está no array dos repitidos
                if(exercicio7.estaContidoNoVetor(repitidos, goiabada[i])) {
                    //se tiver, nao faz nada
                } else {
                    //se não estiver, exibe, e depois coloca o numero no array dos repitidos
                    System.out.print(goiabada[i] + " ");
                    repitidos[i] = goiabada[i];
                }
            }
            
            comenta o outro if e descomenta esse, a função vai funcionar igual :)
             */
        }
    }
}
