/* Elaborar um programa que leia um vetor de 5 posições para números reais e, 
depois, um código inteiro. Se o código for zero, finalize o programa; se for 1, 
mostre o vetor na ordem direta; se for 2, mostre o vetor na ordem inversa.
Caso, o código for diferente de 1 e 2 escreva uma mensagem informando que o código é inválido. */

public class exercicio9 {
    public static void main(String[] args) {
        //criar o array e preenche ele
        double[] paralelepipedo = new double[5];
        paralelepipedo = array.preencherArrayDouble(paralelepipedo);
        
        texto.escreva("arry original: ");
        array.exibirArray(paralelepipedo);
        texto.pulaLinha();

        //chamama o menu
        apresentacao();
        
        //pega a reposta do usuario
        int resposta = texto.inputInt();

        //faz a ação de acordo com o numero
        switch(resposta) {
            case 1:
            exibirArrayNormal(paralelepipedo);
            break;

            case 2:
            exebirArrayInverso(paralelepipedo);
            break;

            default:
            texto.escreva("NUMERO INVALADO ! O PROGRAMA SERÁ ENCERRADO EM BREVE");
            texto.esperar(2);
        }

    }

    public static void apresentacao() {
        texto.escreva("Bem vindo usuario");
        texto.escreva("Qual das ações abaixo você gostaria de executar ?");
        texto.pulaLinha();
        texto.escreva("Digite 1 para mostrar o array na forma padrão");
        texto.escreva("Digite 2  para mostrar o arry na forma inversa (de traz pra frente)");
        texto.escreva("digite 0 para encerrar o programa");
    }

    public static void exibirArrayNormal(double[] cubo) {
        texto.escreva("aqui está seu array padrao");
        array.exibirArray(cubo);
    }

    public static void exebirArrayInverso(double[] tetraedo) {

        texto.escreva("aqui está seu array invertido :)");
        double[] invertido = new double[tetraedo.length];

        invertido = inverterArray(tetraedo);
        array.exibirArray(invertido);
    }

    public static double[] inverterArray(double[] icosaedro) {
        double[] retorno = new double[icosaedro.length];
        
        //minha variavel auxialiar vai varrer o array de RETORNO de frete pra traz
        int variavelAuxiliar= 0;

        //esse for varre o array ICOSAEDRO de traz pra frente.
        for(int i = icosaedro.length -1; i>=0; i --) {
            retorno[variavelAuxiliar] = icosaedro[i];
            variavelAuxiliar ++;
        }

        return retorno;

    }
}
