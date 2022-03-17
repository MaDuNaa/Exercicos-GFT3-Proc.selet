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
				System.out.println(contador + "- Digite um n�mero inteiro : ");
				int num = sc.nextInt();
					
				
				if(lista.stream().anyMatch(n -> n.intValue() == num)) {
					System.out.println("N�o � permitido n�mero repetido");
					sc.nextLine();
					contador --;
				}
				lista.add(num);
				
			
			}catch(InputMismatchException e) {
				System.out.println("Erro Digite um n�mero inteiro novamente");	
				sc.nextLine();
				contador --;
			}
			
			contador ++;
			}

		System.out.println("");
				
		System.out.println("Maior n�mero");
		System.out.println(lista.stream().max(Comparator.comparingInt(Integer::intValue)));
		System.out.println("");
		System.out.println("Menor n�mero");
		System.out.println(lista.stream().min(Comparator.comparingInt(Integer::intValue)));	
		System.out.println("");
		System.out.println("M�dia");
		lista.stream()
				.mapToInt(n -> n)
				.average()
				.ifPresent(System.out::println);
		
		System.out.println("");
		System.out.println("Quantidade de n�meros maiores que 50");
		System.out.println(lista.stream().filter((n) -> (n > 50)).count());
		System.out.println("");
		System.out.println("Quais s�o:");
		System.out.println(lista.stream().filter((n) -> (n > 50)).collect(Collectors.toList()));
		
		sc.close();
	}

}
