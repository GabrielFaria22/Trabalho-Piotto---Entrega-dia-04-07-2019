package Exec03;

public class TesteException {

	public static void main(String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
		
	}
	static void metodo1() {
		System.out.println("Inicio do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");
	}
	static void metodo2() {
		System.out.println("Inicio do metodo2");
		int[] array = new int[10];
		try {
		for( int i = 0; i <= 15; i++) {
			array[i] = i;
			System.out.println(i);
		}
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Tamanho do vetor excedido. Erro: " + ex);
		}
		System.out.println("Fim do metodo2");
	}
}


public class TesteException {
	
	public static void  main(String() args)  (
				System.out.printIn("inicio  do main");
				metodol();
				System.out.println("fim  do main");
	static void metodol() {
		System.out.println("inicio  do metodol");
		metodo2();
		System.out.println("fim  do metodol");
	}
	static void metodo2() {
			System.out.println("inicio  do metodo2");
			int[]  array  =  new  int[10];
			for  (int  i  =  0;  1 <= 15; i++)  (
			array([i]  =  i;
					System.out.println(i);
	}
				
					
					
					
					
					
					
					
					