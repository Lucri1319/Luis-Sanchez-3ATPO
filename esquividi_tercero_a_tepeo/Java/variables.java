package esquividi_tercero_a_tepeo;

import java.util.Scanner;

public class variables {
	public static void main(String[] args) {
	
	int numero;
	char sexo = 'f';
	boolean flag = true; // variables lógicas true false
	double precio = 45.4;
	float cantidad = 77;
	String nombre = "Luis";
	
	System.out.println(" Hola " +precio);
	System.out.println(" Hola " +nombre +cantidad);
	
	Scanner captura = new Scanner(System.in);
	while(flag) {
			System.out.println("Selecciona una opción en el menú");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Salir");
			int op = captura.nextInt();
			
			
			int resultado,num1,num2;
			switch(op) {
			case 1:
			System.out.println("valor 1: ");
			num1 = captura.nextInt();
			System.out.println("valor 2: ");
			num2 = captura.nextInt();
			resultado = num1+num2;
			System.out.println("Resutado: " +resultado);
			break;
	
			case 2:
				System.out.println("valor 1");
				num1 = captura.nextInt();
				System.out.println("valor 2");
				num2 = captura.nextInt();
				resultado = num1-num2;
				System.out.println("Resutado: " +resultado);
				break;
			case 3:
				System.out.println("Adios");
				flag = false;
				break;
	}}
}
	}