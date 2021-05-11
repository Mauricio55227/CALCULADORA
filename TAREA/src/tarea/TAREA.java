package tarea;
import java.util.Scanner;

/**
 *
 * @author BLANQUET
 */
public class TAREA {

    public static void Encabezado() {
        System.out.println("Universidad Autonóma de Campeche");
        System.out.println("Facultad de Ingeniería");
        System.out.println("Ingeniería de Sistemas Computacionales");
        System.out.println("Mayo 2021");
    }
    
    public static void Cuerpo(){
        System.out.println("=========================================================");
        System.out.println("Calculadora básica");
    }
    
    public static void Pie() {
        System.out.println("---------------------------------------------------------");
        System.out.println("MAURICIO BLANQUET.2021");
    }
    
    
    public static void main(String[] args) {

        String[] a = {"SUMAR", "RESTAR", "MULTIPLICAR", "DIVIDIR"};
        Encabezado();
        Cuerpo();
        Scanner entrada = new Scanner(System.in);
    
     System.out.println("\n [0]SUMA \n " + "[1]RESTA\n " + "[2]MULTIPLICACION\n " + "[3]DIVISION\n");

        int opcion;
        System.out.print("\nSeleccione una opcion: ");
        opcion = entrada.nextInt();

        while (opcion < 0 || opcion > 3) {

            System.out.print("\nOpcion no valida.\n");
            System.out.println("---------------------------------------------------------");
            System.out.print("\nSeleccione una opcion valida: ");
            opcion = entrada.nextInt();

        }

        int n1;
        int n2;

        System.out.println("Inserte el primer numero a " + a[opcion] + ":");
        n1 = entrada.nextInt();
        System.out.println("Inserte el segundo numero a " + a[opcion] + ":");
        n2 = entrada.nextInt();

        Calculadora prueba = new Calculadora(n1, n2);

        switch (opcion) {

            case 0:

                int u = prueba.sumar();
                System.out.println("\nEl resultado de la suma es: " + u);

                break;

            case 1:

                int y = prueba.restar();
                System.out.println("\nEl resultado de la resta es: " + y);

                break;

            case 2:

                int w = prueba.multiplicar();
                System.out.println("\n El resultado de la multiplicacion es: " + w);

                break;

            case 3:

                double p = prueba.dividir();
                System.out.println("\n El resultado de la division es : " + p);
                
        }   
     Pie();  
    }
}
