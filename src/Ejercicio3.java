public class Ejercicio3 {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        System.out.println(maxnumeros(a,b));

        System.out.println(maxnumeros(a,b,c));


    }
    public static int maxnumeros(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static int maxnumeros(int num1, int num2, int num3) {
       int mayor = maxnumeros(num1,num2);
       if (mayor > num3){
           return mayor;
       }else{
           return num3;
       }


    }
}
