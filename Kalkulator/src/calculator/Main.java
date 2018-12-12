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
			System.out.println("Wybierz opcj�!");
			System.out.println("1-Oblicz pole prostopad�o�cianu");
			System.out.println("2-Oblicz obj�to�� prostopad�o�cianu");
			System.out.println("0-Wyjdz z programu");

			System.out.println("Wybierz opcj�: ");
			option = input.nextInt();
			input.nextLine();

			switch (option) {
			case POLE:
				System.out.println("Podaj d�ugo�� boku:");
				calc.setA(input.nextDouble());
				System.out.println("Podaj szeoko��:");
				calc.setB(input.nextDouble());
				System.out.println("Podaj wysoko��:");
				calc.setH(input.nextDouble());
				System.out.println("Pole prostopad�o�cianu wynosi = " + calc.poleProstopadloscianu() + " cm");
				break;
			case OBJETOSC:
				System.out.println("Podaj d�ugo�� boku:");
				calc.setA(input.nextDouble());
				System.out.println("Podaj szeroko��:");
				calc.setB(input.nextDouble());
				System.out.println("Podaj wysoko��:");
				calc.setH(input.nextDouble());
				System.out.println("Obj�to�� prostopad�o�cianu wynosi = " + calc.objetoscProstopadloscianu() + " cm");
				break;
			case EXIT:
				System.out.println("Ko�cz� prac� programu!");
				break;
			default:
				System.out.println("Nie ma takiej opcji");
			}

		}
		input.close();

	}

}
