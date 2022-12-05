package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Vida inicial: ");
		int inicialLife = sc.nextInt();
		System.out.print("Ataque: ");
		int attack = sc.nextInt();
		System.out.print("Armadura: ");
		int armor = sc.nextInt();

		Champion ch1 = new Champion(name, inicialLife, attack, armor);

		System.out.println();
		System.out.println("Digite os dados do segundo campeão: ");
		System.out.print("Nome: ");
		sc.nextLine();
		name = sc.nextLine();
		System.out.print("Vida inicial: ");
		inicialLife = sc.nextInt();
		System.out.print("Ataque: ");
		attack = sc.nextInt();
		System.out.print("Armadura: ");
		armor = sc.nextInt();

		Champion ch2 = new Champion(name, inicialLife, attack, armor);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Resultado do turno " + (i + 1) + ":");
			ch1.takeDamage(ch2);
			ch2.takeDamage(ch1);
			System.out.println(ch1.status());
			System.out.println(ch2.status());
			if (ch1.getLife() <= 0 || ch2.getLife() <= 0) {
				break;
			}
		}

		System.out.println();
		System.out.println("FIM DO COMBATE");

		sc.close();
	}
}
