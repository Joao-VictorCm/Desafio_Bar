package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Sexo (M ou F) :");
		Bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		Bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerante: ");
		Bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		Bill.barbecue = sc.nextInt();

		System.out.println("RELATÓRIO");
		double totalFeeding = Bill.feeding(Bill.beer, Bill.barbecue, Bill.softDrink);
		System.out.println("Consumo = R$ " + totalFeeding);

		if (Bill.cover(totalFeeding) == 4) {
			System.out.println("Couvert = R$ " + Bill.cover(totalFeeding));
		} else {
			System.out.println("Isento de Couvert");
		}

		double valorEntrada = Bill.ticket(Bill.gender);
		System.out.println("Ingresso = R$ " + valorEntrada);

		double totalNoite = Bill.total(totalFeeding, valorEntrada, Bill.cover(totalFeeding));
		System.out.println("Valor a pagar = R$ " + totalNoite);
	}

}
