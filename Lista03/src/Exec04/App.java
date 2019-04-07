package Exec04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double r = 0;
		double x = 0, y = 0;
		boolean deucerto1 = false, deucerto2 = false;
		System.out.println("Eu sei dividir!");

		System.out.println("Informe o primeiro valor: ");
		try {
			x = teclado.nextDouble();
			deucerto1 = true;
		} catch (InputMismatchException i) {
			System.out.println("deve-se digitar um numero");
		}

		System.out.println("Informe o segundo valor: ");

		try {
			y = teclado.nextDouble();
		} catch (InputMismatchException t) {
			System.out.println("deve-se digitar um num");
		}

		try {
			r = (x / y);
		} catch (ArithmeticException a) {
			System.out.println("erro na operacao matematica");
		} catch (NumberFormatException n) {
			System.out.println("erro, formato de numero nao reconhecido");
		}
		System.out.println("O resultado da divisão é: " + r);
		teclado.close();

	}

}
