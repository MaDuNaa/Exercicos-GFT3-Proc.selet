package Ex04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input: ");
		String numeros = sc.nextLine();
		String[]vect = numeros.split(" ");
	
		int maior = 0;
		int soma = 0;
		
		for(int i = 0; i < vect.length; i++) {
			
			if (Integer.parseInt(vect[i]) > maior) {
				maior = Integer.parseInt(vect[i]);
			}
			
			soma += Integer.parseInt(vect[i]);
		}
		
		System.out.println("Output:");
		System.out.println("O maior número é "+ maior);
		System.out.println("A soma dos valores é "+ soma);
		
		sc.close();
	}

}
