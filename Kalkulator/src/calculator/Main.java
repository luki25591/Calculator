package calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	private static final int EXIT = 0;
	private static final int POLE = 1;
	private static final int OBJETOSC = 2;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		input.useLocale(Locale.US);

		int option = -1;

		Calc calc = new Calc();

		while (option != EXIT) {
			System.out.println("Wybierz opcjê!");
			System.out.println("1-Oblicz pole prostopad³oœcianu");
			System.out.println("2-Oblicz objêtoœæ prostopad³oœcianu");
			System.out.println("0-Wyjdz z programu");

			System.out.println("Wybierz opcjê: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case POLE:
				System.out.println("Podaj d³ugoœæ boku:");
				calc.setA(input.nextDouble());
				System.out.println("Podaj szeokoœæ:");
				calc.setB(input.nextDouble());
				System.out.println("Podaj wysokoœæ:");
				calc.setH(input.nextDouble());
				System.out.println("Pole prostopad³oœcianu wynosi = " + calc.poleProstopadloscianu() + " cm");
				break;
			case OBJETOSC:
				System.out.println("Podaj d³ugoœæ boku:");
				calc.setA(input.nextDouble());
				System.out.println("Podaj szerokoœæ:");
				calc.setB(input.nextDouble());
				System.out.println("Podaj wysokoœæ:");
				calc.setH(input.nextDouble());
				System.out.println("Objêtoœæ prostopad³oœcianu wynosi = " + calc.objetoscProstopadloscianu() + " cm");
				break;
			case EXIT:
				System.out.println("Koñczê pracê programu!");
				break;
			default:
				System.out.println("Nie ma takiej opcji");
			}

		}
		input.close();

	}

}
