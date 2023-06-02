package pkg1;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        int op = 0;
        metodos metodos = new metodos();
    
        Scanner scanner = new Scanner(System.in);
        
        metodos.mensajeBienvenida();
        int respuestaUsuario = scanner.nextInt();
        
        if (respuestaUsuario == 1) {
            do {
            System.out.println("Selecciona una opcion: \n"
                    + "1: Suma.\n"
                    + "2: Resta.\n"
                    + "3: Multiplicacion.\n"
                    + "4: Division.\n"
                    + "5: Salir.");
            
            op = scanner.nextInt();
            switch (op) {
            case 1: 
                System.out.println("Digite dos numeros para sumar: ");
                metodos.datos();
                metodos.sumarNumeros();
                break;
            case 2: 
                System.out.println("Digite dos numeros para restar: ");
                metodos.datos();
                metodos.restarNumeros();
                break;
            case 3:
                System.out.println("Digite dos numeros para multiplicacion: ");
                metodos.datos();
                metodos.multiplicarNumeros();
                break;
            case 4: 
                System.out.println("Digite dos numeros para dividir: ");
                metodos.datos();
                metodos.dividirNumeros();
                break; 
            case 5:
                metodos.mensajeDespedida();
                System.exit(0);
                break;
            
            default:
                System.out.println("Opcion incorrecta.");
                break;
                
            }
            
            }
            while (op!=5);
        }
        else {
            System.out.println("Has salido del programa.");
            System.exit(0);
        }
    
        
    }

}