package Exec02;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		
		Scanner leitor=new Scanner(System.in);
		double d;
		String s=new String();
		
		
		
		s=leitor.nextLine();
		
		try {
			d=Double.parseDouble(s);
			System.out.println("deu certo");
		}catch(NumberFormatException e){
			System.out.println("erro na conversao de string para double");
		}
		
		

	}

}
