import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        System.out.print("Ingrese la cantidad de numeros a utilizar: ");
        numeros= new int[sc.nextInt()];
        System.out.println("Ingrese Los numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]=sc.nextInt();
        }
        int[] inverso=new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            inverso[i]= numeros[numeros.length -1 -i];
        }
        for (int i = 0; i < numeros.length; i++) {
            numeros[i]= inverso[i];
        }
        System.out.println("Numeros Invertidos:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
}
