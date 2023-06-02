package pkg1;
import java.util.Scanner;

public class metodos {

    int num1,num2;
    int suma,resta;
    int multiplicacion,division;
    Scanner scanner = new Scanner(System.in);
    
    public static void mensajeBienvenida() {
        System.out.println("Bienvenido, desea realizar una operacion matematica?\n"
                + "Digite 1 para continuar o 0 para salir: ");
    }    
    
    public void mensajeDespedida() {
        System.out.println("Has salido del programa.");
    }
    
    public void datos() {
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        }
    
    public void sumarNumeros() {
        suma = num1+num2;
        System.out.println("El resultado de la suma es: "+suma+"\n");
    }
    
    public void restarNumeros() {
        resta = num1 - num2;
        System.out.println("El resultado de la resta es: "+resta+"\n");
    }
    
    public void multiplicarNumeros() {
        multiplicacion= num1 * num2;
        System.out.println("El resultado de la multiplicacion es: "+multiplicacion+"\n");
    }
    
    public void dividirNumeros() {
        division = num1 / num2;
        System.out.println("El resultado de la division es: "+division+"\n");
    }
    
    
 }
