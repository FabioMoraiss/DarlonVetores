package utilidades;
import java.util.Scanner;

public class texto {
    public static Scanner input = new Scanner(System.in);

    public static String input() {
        String texto = input.next();
        return texto;
    }

    public static int inputInt() {
        int numero = input.nextInt();
        return numero;
    }

    public static void escreva(String x) {
        for (int i = 0; i < x.length(); i++) {
            System.out.print(x.charAt(i));
            esperar();
        }
        System.out.println();
    }

    public static void pulaLinha(){
        System.out.println();
    }

    public static void esperar(){
        try {
            Thread.sleep(8);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
