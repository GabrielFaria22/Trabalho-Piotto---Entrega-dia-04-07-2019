package Exec01;

public class Pessoa {
	
	public String cpf=new String();
	public String nome=new String();
	
	public Pessoa() {
		this.cpf=cpf;
		this.nome=nome;
	}
	
	public String toString() {
		return nome+" "+cpf;
		
	}
	
	public boolean equals(Pessoa p) {
		if(this.cpf==p.cpf) {
			return true;
		}else {
			return false;
		}
	}
	
	

}
