public class exercicio6 {
    public static void main(String[] args) {

        //cira o array
        float[] girasol = new float[10];
        double[] rosa = new double[girasol.length];

        //cria o array sem as regras aplicadas
        girasol = array.preencherArrayFloat(girasol);
       array.exibirArray(girasol);

        //criar o arry com as regras aplicadas      
       rosa = gerarQuadrados(girasol);
       array.exibirArray(rosa);
    }

    public static double[] gerarQuadrados(float[] orquidia) {
        double[] retorno = new double[orquidia.length];

        for(int i=0; i<orquidia.length; i++) {

            //gerar o quadrado do numero, ou seja, eleva ele a 2
            //infelzimente não consegui fazer o java retornar valores mais precisos, ele sempre erra na segunda casa decimal
            retorno[i] = (double) Math.pow(orquidia[i], 2);
        }

        return retorno;
    }
}
