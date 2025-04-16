package models;

public class GerenteBanco extends Funcionario{
	private double bonificacao;
	private String tipo;
	
	public GerenteBanco(String nome, String telefone, int matricula, double salario, double bonificacao, String tipo) {
		super(nome, telefone, matricula, salario);
		this.bonificacao = bonificacao;
		this.tipo = tipo;
	}

	public double getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(double bonificacao) {
		this.bonificacao = bonificacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@Override
	public void aumentoSalario(float percentual) {
	    if (percentual > 0) {
	        double novoSalario = getSalario() + (getSalario() * percentual / 100);
	        setSalario(novoSalario);
	    } else {
	        System.out.println("Percentual inválido para aumento!");
	    }
	}

	
	@Override
	public double totalRecebimentoAnual() {
		return (12 * getSalario() * (bonificacao / 100)) + getSalario() * 12;
	}

	@Override
	public String toString() {
		return "Gerente:" +
	               "\nNome: " + getNome() +
	               "\nTelefone: " + getTelefone() +
	               "\nMatrícula: " + getMatricula() +
	               "\nSalário mensal: R$" + String.format("%.2f", getSalario()) +
	               "\nBonificação: " + (bonificacao) + "%" +
	               "\nTipo: " + getTipo() +
	               "\nRecebimento anual: R$" + String.format("%.2f", totalRecebimentoAnual());
	}
	
	
	
}
