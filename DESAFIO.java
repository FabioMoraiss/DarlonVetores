/* LINK DO DESAFIO: https://olimpiada.ic.unicamp.br/pratique/p2/2021/f2/lista/ */
public class DESAFIO {
    public static void main(String[] args) {
        // declara meu array
        int[] vetorInicial = {10 ,20 ,30 ,40, 50, 60, 70, 80};

        // mostra na tela o numero de opera coes para fazer o PALINDROMO
        System.out.println(numero_de_operacoes(vetorInicial, 0));

    }

    // retorna o numero de operacoes recursivamente
    public static int numero_de_operacoes(int[] vetorVELHO, int contador) {
        contador++;
        if (ehPalindromo(vetorVELHO)) {
            contador--;
        } else {
            int[] vetorNOVO = new int[vetorVELHO.length - 1];
            vetorNOVO = fazer_a_soma(vetorVELHO);
            contador = numero_de_operacoes(vetorNOVO, contador);

        }

        return contador;
    }

    // faz a soma de acordo com as regras, e devolve um novo vetor com a soma.
    public static int[] fazer_a_soma(int[] vetorVELHO) {
        int[] vetorNOVO = new int[vetorVELHO.length - 1];
        int posicaoDoMenor = -1;
        boolean foiPraDireita = false;

        for (int posicaoATUAL = 0; posicaoATUAL < vetorVELHO.length; posicaoATUAL++) {
            if (verificaNumeroEmPosicoesOpostas(vetorVELHO, posicaoATUAL)) {
                // nao faz nada
            } else {
                posicaoDoMenor = encontrarOMenor(vetorVELHO, posicaoATUAL);
                if (posicaoDoMenor == 0) {
                    // faz a soma da posicao 0 + posicao 1
                    vetorNOVO[posicaoDoMenor] = vetorVELHO[posicaoDoMenor] + vetorVELHO[posicaoDoMenor + 1];
                    foiPraDireita = true;
                } else if (posicaoDoMenor == vetorVELHO.length - 1) {
                    // faz a soma da ultima posicao - 1
                    vetorNOVO[vetorNOVO.length - 1] = vetorVELHO[posicaoDoMenor] + vetorVELHO[posicaoDoMenor - 1];
                } else {
                    if (somaPraDIREITA(vetorVELHO, posicaoDoMenor)) {
                        vetorNOVO[posicaoDoMenor] = vetorVELHO[posicaoDoMenor] + vetorVELHO[posicaoDoMenor + 1];
                        foiPraDireita = true;
                    } else {
                        vetorNOVO[posicaoDoMenor -1] = vetorVELHO[posicaoDoMenor] + vetorVELHO[posicaoDoMenor - 1];

                    }
                }
                break;
            }
        }
        if (foiPraDireita) {
            vetorNOVO = fazerCopia(vetorVELHO, vetorNOVO, posicaoDoMenor);
        } else {
            vetorNOVO = fazerCopia(vetorVELHO, vetorNOVO, posicaoDoMenor -1);
        }

        return vetorNOVO;

    }

    // parei nessa parte de fazer a copia
    public static int[] fazerCopia(int[] vetorVELHO, int[] vetorNOVO, int posicaoDoMenor) {

        for (int i = 0, j = 0; i < vetorNOVO.length; i++, j++) {
            if ((vetorNOVO[i] == 0) && i != posicaoDoMenor) {
                vetorNOVO[i] = vetorVELHO[j];
            } else if (i == posicaoDoMenor) {
                j++;
            }
        }
        return vetorNOVO;
    }

    // encontra o menor valor entre dois, retora o menor
    // ao chegar nesse ponto, ja sei que os numeros sao diferentes, e nao sao iguais
    public static int encontrarOMenor(int[] vetorVELHO, int posicaoATUAL) {

        if (vetorVELHO[posicaoATUAL] > vetorVELHO[vetorVELHO.length - 1 - posicaoATUAL]) {
            return vetorVELHO.length - 1 - posicaoATUAL;
        }

        return posicaoATUAL;
    }

    // verifica se os numeros em pocioes opostas do vetor, sao iguais
    // ele recebe a lista e a posicao;
    public static boolean verificaNumeroEmPosicoesOpostas(int[] vetorVELHO, int posicaoATUAL) {
        if (vetorVELHO[posicaoATUAL] == vetorVELHO[vetorVELHO.length - 1 - posicaoATUAL]) {
            return true;
        }

        return false;

    }

    // recebe uma lista, e confere se ela eh palindroma
    public static boolean ehPalindromo(int[] vetorVELHO) {

        for (int i = 0; i < vetorVELHO.length; i++) {

            if (vetorVELHO[i] == vetorVELHO[vetorVELHO.length - 1 - i]) {
                // nao faz nada
            } else {
                return false;
            }
        }

        return true;
    }

    public static boolean somaPraDIREITA(int[] vetorVELHO, int posicaoDoMenor) {

        if (verificaNumeroEmPosicoesOpostas(vetorVELHO, posicaoDoMenor + 1)) {
            return false;
        }
        return true;
    }

}

// vou somar o menor numero com o menor numero da sua lateral, DESDE QUE, esse
// numero nao seja um numero que tem
// palindromo
// cuidado pra nao acessar posicoes de memoria invalidas.
