import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
    int [] numeros;
    numeros = new int[5];
    numeros[0]=10;
    numeros[1]=11;
    numeros[2]=12;
    numeros[3]=13;
    numeros[4]=14;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    arrayInverso(numeros);
        System.out.println("convertido");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

    }
    public static void arrayInverso(int[]a){

        int[] inverso=new int[a.length];
        for (int i = 0; i < a.length; i++) {
          inverso[i]= a[a.length -1 -i];
        }
        for (int i = 0; i < a.length; i++) {
            a[i]= inverso[i];
        }



    }
}
