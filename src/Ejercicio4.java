public class Ejercicio4 {
    public static void main(String[] args) {
    esVocal('a');
    }
    public static void esVocal(char vocal){

       switch (vocal){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Es vocal");
                break;
           default:
               System.out.println("No es vocal");
        }

    }
}
