import java.util.Arrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        int []entero = new int[5];
        entero[0]=69;
        entero[1]=66;
        entero[2]=95;
        entero[3]=78;
        entero[4]=65;
        enteroArrayString(entero);
        //for (int i = 0; i < entero.length; i++) {
         //   System.out.println(entero[i]);
        //}
    }
    public  static void enteroArrayString(int[]a){
        String random;
        for (int i = 0; i < a.length; i++) {
        a[i]=(int)(Math.random()*100);
            random=Arrays.toString(a);
            
            //System.out.println(random);

        }

    }
}
