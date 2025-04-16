package models;

import java.time.LocalTime;

public class CaixaBanco extends Funcionario{
	private LocalTime horario;

	public CaixaBanco(String nome, String telefone, int matricula, double salario, LocalTime horario) {
		super(nome, telefone, matricula, salario);
		this.horario = horario;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}

	@Override
	public String toString() {
		return "Caixa de Banco:" +
	               "\nNome: " + getNome() +
	               "\nTelefone: " + getTelefone() +
	               "\nMatrícula: " + getMatricula() +
	               "\nSalário mensal: R$" + String.format("%.2f", getSalario()) +
	               "\nHorário de entrada: " + getHorario() +
	               "\nRecebimento anual: R$" + String.format("%.2f", totalRecebimentoAnual());
	}
	
	
}
