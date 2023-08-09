/* LINK DO DESAFIO: https://olimpiada.ic.unicamp.br/pratique/p2/2021/f2/lista/ */
public class DESAFIO {
    public static void main(String[] args) {
        //declara meu array
        int[] arroz = {999, 1, 999};

        //mostra na tela o numero de opera coes para fazer o PALINDROMO
        System.out.println(numero_de_operacoes(arroz));

        
    }
    //retorna o numero de operacoes recursivamente
    public static int numero_de_operacoes(int[] k) {
        int contador=0;

        if(ehPalindromo(k)) {
            //nao faz nada
        } else {
            int[] feijao = new int[k.length -1];
            feijao = fazer_a_soma(k);


            contador++;
        }

        return contador;
    }  

    //faz a soma de acordo com as regras, e devolve um novo vetor com a soma.
    public static int[] fazer_a_soma(int[] l) {
        int[] abacaxi = new int[l.length];

        for(int i =0; i<l.length; i++) {
            if(verificaNumeroEmPosicoesOpostas(l, i)) {
                //nao faz nada
            }
            else {
                int posicaoDoMenor = encontrarOMenor(i, l.length -1 - i);
                if(posicaoDoMenor == 0) {
                    //faz a soma da posicao 0 + posicao 1
                    abacaxi[posicaoDoMenor] = l[posicaoDoMenor] + l[posicaoDoMenor + 1] ;
                } else if(posicaoDoMenor == l.length -1) {
                    //faz a soma da ultima posicao - 1
                    abacaxi[abacaxi.length -1] = l[posicaoDoMenor] + l[posicaoDoMenor -1];
                } else {
                    if(somaPraDIREITA(l, posicaoDoMenor)) {
                        abacaxi[posicaoDoMenor] = l[posicaoDoMenor] + l[posicaoDoMenor + 1] ;
                    } else {
                     abacaxi[posicaoDoMenor] =  l[posicaoDoMenor] + l[posicaoDoMenor -1];
                    }
                }
                break;
            }
        }
        abacaxi = fazerCopia(l, abacaxi);

        return abacaxi;



    }

    //parei nessa parte de fazer a copia
    public static int[] fazerCopia(int[] l, int[] abacaxi) {
        
        for(int i = 0; i<abacaxi.length; i++) {

        }
    }

    //encontra o menor valor entre dois, retora o menor
    // ao chegar nesse ponto, ja sei que os numeros sao diferentes, e nao sao iguais
    public static int encontrarOMenor(int b, int t) {

        if(b > t) {
            return t;
        }

        return b;
    }

    //verifica se os numeros em pocioes opostas do vetor, sao  iguais
    //ele recebe a lista e a posicao;
    public static boolean verificaNumeroEmPosicoesOpostas(int[] c, int s) {
        if(c[s] == c[c.length - 1 -s]) {
            return true;
        }

        return false;
        
    }

    //recebe uma lista, e confere se ela eh palindroma
    public static boolean ehPalindromo(int[] x) {

        for(int i =0; i<x.length; i++) {

            if(x[i] == x[x.length -1 - i]) {
                //nao faz nada
            } else {
                return false;
            }
        }

        return true;
    }


    public static boolean somaPraDIREITA(int[] vetor, int posicaoDoMenor) {
    
    if(verificaNumeroEmPosicoesOpostas(vetor, posicaoDoMenor + 1)) {
        return false;
    }
    return true;
    }

}

//vou somar o menor numero com o menor numero da sua lateral, DESDE QUE, esse numero nao seja um numero que tem
// palindromo
// cuidado pra nao acessar posicoes de memoria invalidas.
