
import java.util.Scanner;
public class pila{
    public static void main(String[]args){
        Scanner l = new Scanner(System.in);
        System.out.println("-----Validar Palidromo------");
        System.out.println("Ingrese el texto");

        String cadena = l.nextLine();




    }

    public static boolean esPalindromo(String cadena ){
        boolean sw = true;
        cadena = cadena.replace(" ", "");
        for(int i =0; i <cadena.length()/2; i++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length()-1-i)){
                sw = false;
                break;
            }

        }
        return sw;

    }
}