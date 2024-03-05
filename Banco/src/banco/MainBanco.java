package banco;

import java.util.Scanner;

public class MainBanco {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.crearCliente(" "," ");
		cliente.verCliente(  " "," ");
		Cuenta cuenta = new Cuenta ( "1234","0",0.0);
		cuenta.verCuenta();
		cuenta.ingresar(0);
		cuenta.sacar(0);
		
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Ver cuenta");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Sacar dinero");
            System.out.println("4. Crear Cliente");
            System.out.println("5. verCliente");
            System.out.println("6. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                   cuenta.verCuenta();
                    break;
                case 2:
                  cuenta.ingresar(opcion);
                    break;
                case 3:
                    cuenta.sacar(opcion);
                    break;
                case 4:
                    cliente.crearCliente(null, null);
                    break;
                case 5:
                    cliente.verCliente(null, null);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 6);
        
        scanner.close();
	}

}
