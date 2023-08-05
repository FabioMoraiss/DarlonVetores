public class exercicio14 {
    public static void main(String[] args) {
        //criar o vetor N, que armazena as notas finais 
        double[] vetorN = new double[10];

        //preenche o vetorN com notas de 1 a 10
        vetorN = array.preencherArrayDouble(vetorN, 1, 10);

        //exibe o vetorN
        array.exibirArray(vetorN);
        System.out.println();

        //calcula a media dos alunos ACIMA da media, e exibe ela
        double media = calcularMedia(vetorN);
        System.out.println();
        System.out.println("media: " +media);

        //criar o vetor P, com o tamanho do numero de alunos ACIMA da media
        int[] vetorP = new int[calcularTamanhoP(vetorN)];

        //preenche o vetor P de acordo com arega
        vetorP = preencherVetorP(vetorP, vetorN);
        System.out.println();

        //exibe o vetor P
        System.out.println("vetor P:");
        array.exibirArray(vetorP);
    }

    public static double calcularMedia(double[] x) {
        //cria as variaveis
        double media = 0;              //a media dos alunos ACIMA da media
        double soma = 0;                //a soma das notas dos alunos ACIMA da media
        int aludosAcimaMedia =0;        //quantidade de alunos ACIMA da media
    
        System.out.println("notas acima da média:");

        //percorre o vetorN que foi recebido por parametro
        for (int i = 0; i < x.length; i++) {

            //se o a nota da vez, for acima da media, imprime ela
            // soma nota na variavel soma
            //adicionar +1 na variavel alunosAcimaMedia
            if (x[i] >= 6) {
                soma += x[i];
                aludosAcimaMedia++;
                System.out.print(x[i] + " ");           // via exibir os valores acima da media 
            }

        }
        System.out.println(); //so pra ficar melhor visualizar

        //faz a media, que é a soma das notas(acima da media) divido pela quantiade de alunos aimca da media
        media = (double) soma / aludosAcimaMedia;

        return media;
    }

    public static int calcularTamanhoP(double[] y) {

        //quantidade de alunos acima da media
        int aludosAcimaMedia =0;
        
        //percorre o vetorN recebido por parametro
        for (int i = 0; i < y.length; i++) {

            //confere se a nota da vez é acima da media
            if (y[i] >= 6) {

                //se entrar aqui, aumenta a quantidade de alunos acima da média em +1;
                aludosAcimaMedia++;
            }

        }
        //retorna a quantidade 
        return aludosAcimaMedia;
    }

    public static int[] preencherVetorP(int[] h, double[] q) {

        //contardor é minha variavel auxiliar
        int contador =0;

        //percorre o vetorN recebido por parametro
        for(int i =0; i<q.length; i++) {
            
            //se a nota da vez, é maior que a média
            if(q[i]>=6) {
                
                //se entrar aqui, o vetorP na posiçao do meu contator, recebe i
                h[contador] = i;      // aqui ele quer a posição no vetorN, não o valor guardado nessa posição, por isso recebe apenas I
                contador++; //incrementa meu contador
            }
        }

        //lembre-se, o vetorP tem as posições das notas acima da média, não as notas !
        return h;
    }
}
