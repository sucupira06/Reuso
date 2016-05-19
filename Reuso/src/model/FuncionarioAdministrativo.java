package model;
public class FuncionarioAdministrativo {

	private String nome;
	private String cpf;
	private String matricula;
	private double salarioBase;
	private int tempoDeServico;
	/*
	 * OFFICE_BOY = 1
	 * SECRETARIA = 2
	 * TELEFONISTA = 3
	 * DONO = 10
	 */
	private int funcao;

	/**
	 * Cria um funcion�rio.
	 *
	 * @param nome
	 *            O nome do funcion�rio.
	 * @param cpf
	 *            O CPF do funcion�rio.
	 * @param matricula
	 *            A matr�cula do funcion�rio.
	 * @param tempoDeServico
	 *            O tempo de servi�o (em meses) do funcion�rio.
	 */
	public FuncionarioAdministrativo(String nome, String cpf, String matricula, int tempoDeServico, int funcao) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
		this.funcao = funcao;
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
	 * Recupera a fun��o do funcion�rio.
	 *
	 * @return A fun��o atual do funcion�rio.
	 */
	public int getFuncao() {
		return funcao;
	}

	/**
	 * Atribui uma nova fun��o ao funcion�rio.
	 *
	 * @param funcao
	 *            Nova fun��o do funcion�rio.
	 */
	public void setFuncao(int funcao) {
		this.funcao = funcao;
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
	 * Este m�todo computa o sal�rio do funcion�rio.
	 *
	 * @return O sal�rio do funcion�rio;
	 */
	public double computaSalario() {
		return salarioBase + gratificacaoPorTempoDeServico();
	}

	private double gratificacaoPorTempoDeServico() {
		double gratificacaoBase = 1.24 * funcao;
		return getTempoDeServico() * gratificacaoBase;
	}

	/**
	 * Representa um funcion�rio como String.
	 *
	 * @return A string que representa um funcion�rio.
	 */
	public String toString() {
		// return super.toString() + ", matricula " + getMatricula();
		return "Nome " + getNome() + ", cpf " + getCPF() + ", matricula " + getMatricula();
	}

	/**
	 * Testa a igualdade de um objeto com este funcion�rio. Dois objetos da
	 * classe FuncionarioAdministrativo s�o iguais se eles possuem o mesmo nome,
	 * mesmo cpf e t�m a mesma matr�cula.
	 *
	 * @param objeto
	 *            O objeto a comparar com este funcion�rio.
	 * @return true se o objeto for igual a este funcionario, false caso
	 *         contr�rio.
	 */
	public boolean equals(Object objeto) {
		if (!(objeto instanceof FuncionarioAdministrativo)) {
			return false;
		}
		FuncionarioAdministrativo func = (FuncionarioAdministrativo) objeto;
		return getNome().equals(func.getNome()) && getCPF().equals(func.getCPF())
				&& getMatricula().equals(func.getMatricula());
	}
}
