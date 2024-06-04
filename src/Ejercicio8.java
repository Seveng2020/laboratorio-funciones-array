import java.util.Random;

public class Ejercicio8 {
    public static void main(String[] args) {
    int[] queso = new int[3];
    arrayRandom(queso);
        for (int i = 0; i < queso.length; i++) {
            System.out.println(queso[i]);
        }

    }

    public static void arrayRandom(int[]a){
        if(a.length>5){
            System.out.println("False");
        }else {
            Random random = new Random();
            for (int i = 0; i < a.length; i++) {
                a[i] = random.nextInt(26) + 97;
            }
            System.out.println("True");
        }

    }
}
