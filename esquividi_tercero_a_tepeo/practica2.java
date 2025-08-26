package java;

import java.util.Scanner;

public class practica1 {
	public static void main(String[] args) {
	int[] numeros = new int[15];
	int num;
	Scanner captura = new Scanner(System.in);
	
	for(int x =10; x<numeros.length;) {
		System.out.println("Dame el valor" +x);
		num = captura.nextInt();
		numeros[x] = num;
	}
	
	for(int i = 0; i < numeros.length; i++) {
		//String n = numeros[i] %2 == 0 ? "hola" : "no";
	}
	}
}
sdf
