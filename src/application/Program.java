package application;

import java.text.ParseException;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		Quartos[] vect = new Quartos[10];
		
		System.out.println("Quantos quartos vão ser alugados: ");
		int n = sc.nextInt();
		
		
		for(int i = 1; i <=n; i++) {
			System.out.println();
			System.out.println("Quarto #" + i + ":");
			System.out.println("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email: ");
			String email = sc.nextLine();
			System.out.println("Indique o número do quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Quartos(nome, email);
		}
		
		System.out.println();
		System.out.println("Quartos ocupados: ");
		for(int i = 0; i < 10; i++) {
			if(vect[i] != null) {
				System.out.println(i + ": " + vect[i]);
			}
		}
		sc.close();
	}

}
