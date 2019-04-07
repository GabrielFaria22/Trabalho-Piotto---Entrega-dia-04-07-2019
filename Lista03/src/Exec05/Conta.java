package Exec05;

public class Conta {
	
	public double saldo;
	

	public Conta() {
		this.saldo=saldo;

	}
	
	
	public void sacar(double valorsaque) throws ContaExcecao{
		try {
			if(valorsaque>saldo) {
				throw new ContaExcecao();
			}
			saldo=saldo-valorsaque;
			System.out.println("sacou "+valorsaque+" reais");
			System.out.println("saldo: "+saldo);
			
		}
		
		catch(ContaExcecao c) {
			System.out.println("saldo insuficiente");
		}
	}

}
