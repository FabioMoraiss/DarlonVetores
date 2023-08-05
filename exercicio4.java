public class exercicio4 {
    public static void main(String[] args) {

        //cria o arry e preenche ele
        int[] banana = new int[6];
        banana = array.preencherArrayInteiro(banana, 6, 1);
        
        // exibe o vetor sem regras e pula linha 
        array.exibirVetor(banana);
        System.out.println(); 

        //regras do exercicio
        int maiorNumeroLido = maiorNumeroLido(banana);
        int menorNumeroLido = menorNumeroLido(banana);
        int iguaisAoPrimeiro = igualAoPrimeiro(banana);


        //saida
        System.out.println("o maior numero lido foi: " + maiorNumeroLido);
        System.out.println("o menor numeor lido foi: " + menorNumeroLido);
        System.out.println("quantidade de numeros iguais ao primeiro: " + iguaisAoPrimeiro);

    }

    public static int maiorNumeroLido(int[] maca)  {
        
        // pega o MENOR numero inteiro possível em java, que é -2 147 483 648
        int maior = Integer.MIN_VALUE;

        for(int i = 0; i<maca.length; i++) {
            if(maca[i] > maior) {
                maior = maca[i];
            }
        }

        return maior;
    }

    public static int menorNumeroLido(int[] pera) {

        // pega o MAIOR numero inteiro possível em java, que é 2 147 483 648
        int menor = Integer.MAX_VALUE;

        for(int i = 0; i<pera.length; i++) {
            if(pera[i] < menor) {
                menor = pera[i];
            }
        }

        return menor;
    }

    public static int igualAoPrimeiro(int[] manga) {

        int quantidade=0; // contador

        for(int i =1; i<manga.length; i++) { //começa do 1 porque 0(primeiro numero) NAO CONTA  

            if(manga[i] == manga[0]) {
                quantidade ++;
            }
        }
        return quantidade;
    }
}
