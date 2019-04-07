package Exec05;

public class App {

	public static void main(String[] args) throws ContaExcecao {

		Conta x = new Conta();

		x.saldo = 200;
		x.sacar(150);
		x.sacar(100);

	}

}
