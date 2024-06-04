import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        String[] dias = new String[7];
        diasSemana(dias);

        for (int i = 0; i < dias.length ; i++) {
        String semana = dias[i];
            System.out.println(semana);
        }
    }
    public static void diasSemana(String[]a){
        if (a.length==7) {
            a[0] = "Lunes";
            a[1] = "Martes";
            a[2] = "Miercoles";
            a[3] = "Jueves";
            a[4] = "Viernes";
            a[5] = "Sabado";
            a[6] = "Domingo";
        }
    }
}
