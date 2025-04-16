package models;

public class Cliente extends Pessoa{
	private int idade;
	private String cpf;
	private String status;
	
	public Cliente(String nome, String telefone, int idade, String cpf) {
		super(nome, telefone);
		this.idade = idade;
		this.cpf = cpf;
		this.status = "A";
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getStatus() {
		if(status.equalsIgnoreCase("A")) {
			return "ativo";
		} else {
			return "inativo";
		}
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public void desativarCliente() {
		if(getStatus().equalsIgnoreCase("ativo")) {
			setStatus("I");
		} else {
			System.out.println("Cliente já está desativado");
		}
	}
	
	@Override
	public String toString() {
		return "" + getNome() + "- Tel:" + getTelefone() + "- idade:" + getIdade() + "- cpf:" + getCpf() + "- " + getStatus();
	}
	
	
}
