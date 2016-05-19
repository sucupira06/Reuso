package model;

public abstract class Funcionario extends Pessoa {

	private double salarioBase;
	private int matricula;
	private int tempoDeServico;
	
	public Funcionario(String nome, int cpf, double salarioBase, int matricula, int tempoDeServico) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getTempoDeServico() {
		return tempoDeServico;
	}

	public void setTempoDeServico(int tempoDeServico) {
		this.tempoDeServico = tempoDeServico;
	}
	
	public abstract double computaSalario();
	
	@Override
	public String toString(){
		return "Nome: " + nome + ", salarioBase: " + getSalarioBase() + ", matricula: " + getMatricula()
				+ ", tempoDeServiço: " + getTempoDeServico();
	}
	
}
