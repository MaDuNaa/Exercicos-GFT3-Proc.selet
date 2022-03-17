package Ex02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 1;
		List<Integer> lista = new ArrayList<>();
					
			
			while(contador <= 10) {
				
			
			try {
				System.out.println(contador + "- Digite um número inteiro : ");
				int num = sc.nextInt();
					
				
				if(lista.stream().anyMatch(n -> n.intValue() == num)) {
					System.out.println("Não é permitido número repetido");
					sc.nextLine();
					contador --;
				}
				lista.add(num);
				
			
			}catch(InputMismatchException e) {
				System.out.println("Erro Digite um número inteiro novamente");	
				sc.nextLine();
				contador --;
			}
			
			contador ++;
			}

		System.out.println("");
				
		System.out.println("Maior número");
		System.out.println(lista.stream().max(Comparator.comparingInt(Integer::intValue)));
		System.out.println("");
		System.out.println("Menor número");
		System.out.println(lista.stream().min(Comparator.comparingInt(Integer::intValue)));	
		System.out.println("");
		System.out.println("Média");
		lista.stream()
				.mapToInt(n -> n)
				.average()
				.ifPresent(System.out::println);
		
		System.out.println("");
		System.out.println("Quantidade de números maiores que 50");
		System.out.println(lista.stream().filter((n) -> (n > 50)).count());
		System.out.println("");
		System.out.println("Quais são:");
		System.out.println(lista.stream().filter((n) -> (n > 50)).collect(Collectors.toList()));
		
		sc.close();
	}

}
