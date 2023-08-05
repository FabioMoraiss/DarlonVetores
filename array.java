public class array {
    public static int[] preencherArrayInt(int[] t) {
        
        //declara um novo array do tamanha do recebido por parametro
        int[] novoArray = new int[t.length];
        
        //declara os valores maximos e minimos
        int valorMaximo = 100;
        int valorMinimo = 1;

        //range é o numero de possibilidades
        int range = valorMaximo - valorMinimo;
        
        //gera um valor aleatório dentro do meu range, e coloca ele dentro do meu array
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
     public static int[] preencherArrayInt(int[] t, int valorMax, int valorMin) {
        int[] novoArray = new int[t.length];
        int valorMaximo = valorMax;
        int valorMinimo = valorMin;
        int range = valorMaximo - valorMinimo;
        
        for(int i =0;i <t.length; i++) {
            novoArray[i] = (int) (Math.random() * range) + valorMinimo;
        }
        
        return novoArray;
        
    }

    public static float[] preencherArrayFloat(float[] t) {
        
        float[] novoArray = new float[t.length];
        float valorMaximo = 100f;
        float valorMinimo = 1f;
        float range = valorMaximo - valorMinimo;

        //aqui você decide quantas casas decimais quer no numero, de 0 até 6;
        int numeroDeCasasDecimais = 2;
        double casas = Math.pow(10, 2);
        
        for(int i =0;i <t.length; i++) {
            float numeroAleatorio = (float) (Math.random() * range) + valorMinimo;

            //essa parte trunca o numero na quantidade de casas decimais 
            float numeroTruncado = (float) (Math.floor(numeroAleatorio * casas) / casas);
            novoArray[i] = numeroTruncado;
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
    /*as duas funçoes a seguir tem o mesmo nome, mas tem tipos de parametros diferentes
     * uma recebe um array de numeros inteiros
     * a outra recebe um array de numeros reais
     * a função que vai ser executada depende do tipo de parametro que você passar para ela
     */
    public static void exibirVetor(int[] x) {

        for(int i=0; i<x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }

    public static void exibirVetor(float[] x) {

        for(int i=0; i<x.length; i++) {
            System.out.print(x[i] + " | ");
        }
        System.out.println();
    }

    public static void exibirVetor(double[] x) {

        for(int i=0; i<x.length; i++) {
            System.out.print(x[i] + " | ");
        }
        System.out.println();
    }
}
