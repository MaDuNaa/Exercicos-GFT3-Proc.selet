package Ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	List<Pessoa>lista = new ArrayList<>();
	
	int contador = 1;

	while(contador <= 5) {
		System.out.print("Informe o nome da "+ contador +"� pessoa: ");
		String name = sc.nextLine();
		
		System.out.print("Informe o cargo da "+ contador +"� pessoa (Starter, Junior ou S�nior): ");
		String cargo = sc.nextLine();
		
		if(!cargo.contains("Starter") && !cargo.contains("Junior")){
			cargo = "S�nior";
		}
		
		Pessoa p = new Pessoa(name, cargo);
		lista.add(p);
		
		contador++;
	}
		
	lista.stream().map(n -> n.getName().concat(" - "+ n.getCargo())).forEach(System.out::println); // imprimindo Lista com nome e cargo
	
	int starter = lista.stream().filter(c -> c.getCargo().contains("Starter")).collect(Collectors.toList()).size(); // quantidade de Starter
	int junior = lista.stream().filter(c -> c.getCargo().contains("Junior")).collect(Collectors.toList()).size();  //quantidade de Junior
	int senior = lista.stream().filter(c -> c.getCargo().contains("S�nior")).collect(Collectors.toList()).size();  //S�nior
	
	System.out.println("Total de pessoas");
	System.out.println("Starter: "+ starter);
	System.out.println("Junior: "+ junior);
	System.out.println("S�nior: "+ senior);
	
	
	sc.close();
	}

}
