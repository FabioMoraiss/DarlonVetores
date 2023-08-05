public class array {
    public static int[] preencherArrayInteiro(int[] t) {
        
        int[] novoArray = new int[t.length];
        int valorMaximo = 100;
        int valorMinimo = 1;
        int range = valorMaximo - valorMinimo;
        
        for(int i =0;i <t.length; i++) {
            novoArray[i] = (int) (Math.random() * range) + valorMinimo;
        }
        
        return novoArray;
        
    }

    /* sim, essa função tem o MESMO nome da função acima, porem, como ela tem parametros diferentes
    eu posso escolher qual eu quero chamar, pela quantidade de parametros que eu passar
    
    se eu passar 1 parametro, eu chamo a primeira função
    se eu passar 3, eu chamo a segunda função
    bem legal, não ?
    meu pau na sua mão kkkk
    */
     public static int[] preencherArrayInteiro(int[] t, int valorMax, int valorMin) {
        int[] novoArray = new int[t.length];
        int valorMaximo = valorMax;
        int valorMinimo = valorMin;
        int range = valorMaximo - valorMinimo;
        
        for(int i =0;i <t.length; i++) {
            novoArray[i] = (int) (Math.random() * range) + valorMinimo;
        }
        
        return novoArray;
        
    }
    
    public static float media(int[] arry) {
        float media;
        int soma=0;
        for(int i = 0; i<arry.length; i++) {
            soma += arry[i];
        }
        media = (float) soma / arry.length;
        return media;
    }
    
    public static void exibirVetor(int[] x) {

        for(int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}
