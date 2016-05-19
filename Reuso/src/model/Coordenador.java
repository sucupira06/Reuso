package model;
import java.util.ArrayList;
import java.util.List;

public class Coordenador {
	private String nome;
	private String cpf;
	private String matricula;
	private double salarioBase;
	private int tempoDeServico;
	private List<String> projetosQueGerencia;

	public Coordenador(String nome, String cpf, String matricula, int tempoDeServico) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
		projetosQueGerencia = new ArrayList<String>();
	}

	/**
	 * Recupera o nome do funcion�rio.
	 *
	 * @return O nome do funcion�rio.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Recupera o CPF do funcion�rio.
	 *
	 * @return O CPF associado ao funcion�rio.
	 */
	public String getCPF() {
		return cpf;
	}

	/**
	 * Atribui um novo nome ao funcion�rio.
	 *
	 * @param nome
	 *            Novo nome do funcion�rio.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Atribui um novo CPF ao funcion�rio.
	 *
	 * @param cpf
	 *            Novo CPF associado ao funcion�rio.
	 */
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Recupera a matr�cula do funcion�rio.
	 *
	 * @return A matr�cula do funcion�rio.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Atribui uma nova matr�cula ao funcion�rio.
	 *
	 * @param matricula
	 *            O valor da nova matr�cula.
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Recupera o sal�rio base do funcion�rio.
	 *
	 * @return O sal�rio do funcion�rio.
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * Atribui um novo sal�rio base ao funcion�rio.
	 *
	 * @param salario
	 *            O novo sal�rio do funcion�rio.
	 */
	public void setSalarioBase(double salario) {
		salarioBase = salario;
	}

	/**
	 * Recupera o tempo de servi�o em meses do funcion�rio.
	 *
	 * @return O tempo de servi�o do funcion�rio.
	 */
	public int getTempoDeServico() {
		return tempoDeServico;
	}

	/**
	 * Atribui um novo tempo de servi�o ao funcion�rio que deve ser maior que o
	 * tempo de servi�o anterior.
	 *
	 * @param tempoDeServico
	 *            Novo valor para tempo de servi�o.
	 */
	public void setTempoDeServico(int tempoDeServico) {
		if (tempoDeServico > this.tempoDeServico)
			this.tempoDeServico = tempoDeServico;
	}

	/**
	 * Este m�todo computa o sal�rio do coordenador.
	 *
	 * @return O sal�rio do coordenador;
	 */
	public double computaSalario() {
		return getSalarioBase() * 2.2 + adicionalPorTempoDeServico();
	}

	private double adicionalPorTempoDeServico() {
		return ((double) getTempoDeServico()) * 2.5;
	}

	/**
	 * Faz este coordenador ser gerente de mais um projeto.
	 *
	 * @param proj
	 *            O novo projeto que este coordenador ir� gerenciar.
	 * @return true caso o novo projeto n�o esteja ainda na lista de projetos e
	 *         seja adicionado com sucesso; false, caso contr�rio.
	 */
	public boolean adicionaProjeto(String proj) {
		if (projetosQueGerencia.contains(proj))
			return false;
		return projetosQueGerencia.add(proj);
	}

	/**
	 * Faz este coordenador deixar de ser gerente de um projeto.
	 *
	 * @param proj
	 *            O projeto que este coordenador n�o ir� mais gerenciar.
	 * @return true caso o projeto seja removido com sucesso; false, caso
	 *         contr�rio.
	 */
	public boolean removeProjeto(String proj) {
		return projetosQueGerencia.remove(proj);
	}

	/**
	 * Representa um coordenador como String.
	 *
	 * @return A string que representa este coordenador.
	 */
	public String toString() {
		return "Nome " + getNome() + ", cpf " + getCPF() + ", matricula "
				+ getMatricula() + ", projetos que gerencia " + projetosQueGerencia;
	}

	/**
	 * Testa a igualdade de um objeto com este coordenador. Dois objetos da
	 * classe Coordenador s�o iguais se eles possuem o mesmo nome, mesmo CPF e
	 * t�m a mesma matr�cula.
	 *
	 * @param objeto
	 *            O objeto a comparar com este coordenador.
	 * @return true se o objeto for igual a este coordenador, false caso
	 *         contr�rio.
	 */
	public boolean equals(Object objeto) {
		if (!(objeto instanceof Coordenador)) {
			return false;
		}
		Coordenador func = (Coordenador) objeto;
		return getNome().equals(func.getNome()) && getCPF().equals(func.getCPF())
				&& getMatricula().equals(func.getMatricula());
	}
}
