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
	 * Cria um funcionário.
	 *
	 * @param nome
	 *            O nome do funcionário.
	 * @param cpf
	 *            O CPF do funcionário.
	 * @param matricula
	 *            A matrícula do funcionário.
	 * @param tempoDeServico
	 *            O tempo de serviço (em meses) do funcionário.
	 */
	public FuncionarioAdministrativo(String nome, String cpf, String matricula, int tempoDeServico, int funcao) {
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.tempoDeServico = tempoDeServico;
		this.funcao = funcao;
	}

	/**
	 * Recupera o nome do funcionário.
	 *
	 * @return O nome do funcionário.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Recupera o CPF do funcionário.
	 *
	 * @return O CPF associado ao funcionário.
	 */
	public String getCPF() {
		return cpf;
	}

	/**
	 * Recupera a função do funcionário.
	 *
	 * @return A função atual do funcionário.
	 */
	public int getFuncao() {
		return funcao;
	}

	/**
	 * Atribui uma nova função ao funcionário.
	 *
	 * @param funcao
	 *            Nova função do funcionário.
	 */
	public void setFuncao(int funcao) {
		this.funcao = funcao;
	}

	/**
	 * Atribui um novo nome ao funcionário.
	 *
	 * @param nome
	 *            Novo nome do funcionário.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Atribui um novo CPF ao funcionário.
	 *
	 * @param cpf
	 *            Novo CPF associado ao funcionário.
	 */
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * Recupera a matrícula do funcionário.
	 *
	 * @return A matrícula do funcionário.
	 */
	public String getMatricula() {
		return matricula;
	}

	/**
	 * Atribui uma nova matrícula ao funcionário.
	 *
	 * @param matricula
	 *            O valor da nova matrícula.
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Recupera o salário base do funcionário.
	 *
	 * @return O salário do funcionário.
	 */
	public double getSalarioBase() {
		return salarioBase;
	}

	/**
	 * Atribui um novo salário base ao funcionário.
	 *
	 * @param salario
	 *            O novo salário do funcionário.
	 */
	public void setSalarioBase(double salario) {
		salarioBase = salario;
	}

	/**
	 * Recupera o tempo de serviço em meses do funcionário.
	 *
	 * @return O tempo de serviço do funcionário.
	 */
	public int getTempoDeServico() {
		return tempoDeServico;
	}

	/**
	 * Atribui um novo tempo de serviço ao funcionário que deve ser maior que o
	 * tempo de serviço anterior.
	 *
	 * @param tempoDeServico
	 *            Novo valor para tempo de serviço.
	 */
	public void setTempoDeServico(int tempoDeServico) {
		if (tempoDeServico > this.tempoDeServico)
			this.tempoDeServico = tempoDeServico;
	}

	/**
	 * Este método computa o salário do funcionário.
	 *
	 * @return O salário do funcionário;
	 */
	public double computaSalario() {
		return salarioBase + gratificacaoPorTempoDeServico();
	}

	private double gratificacaoPorTempoDeServico() {
		double gratificacaoBase = 1.24 * funcao;
		return getTempoDeServico() * gratificacaoBase;
	}

	/**
	 * Representa um funcionário como String.
	 *
	 * @return A string que representa um funcionário.
	 */
	public String toString() {
		// return super.toString() + ", matricula " + getMatricula();
		return "Nome " + getNome() + ", cpf " + getCPF() + ", matricula " + getMatricula();
	}

	/**
	 * Testa a igualdade de um objeto com este funcionário. Dois objetos da
	 * classe FuncionarioAdministrativo são iguais se eles possuem o mesmo nome,
	 * mesmo cpf e têm a mesma matrícula.
	 *
	 * @param objeto
	 *            O objeto a comparar com este funcionário.
	 * @return true se o objeto for igual a este funcionario, false caso
	 *         contrário.
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
