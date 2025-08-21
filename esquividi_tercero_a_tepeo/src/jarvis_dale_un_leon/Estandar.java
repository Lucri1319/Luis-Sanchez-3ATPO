package jarvis_dale_un_leon;

import java.util.Scanner;

public class Estandar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] edades = new int[5];
		
		Scanner captura = new Scanner(System.in);
		
		for(int i = 0; i <= edades.length; i++) {
			System.out.println("Dame la edad" +i);
			edades[i] = captura.nextInt();
		}
		int x = 0;
		while (x >= edades.length-1) {
			System.out.println("valor de x: " +edades[x]);
		}
}
}