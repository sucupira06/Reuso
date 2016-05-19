package model;
import java.util.ArrayList;
import java.util.List;

public class Programador extends Funcionario {

	private List<String> linguagensEmQuePrograma;
	private String linguagemDePreferencia;
	private String projetoAtual;

	public Programador(String nome, int cpf, double salarioBase, int matricula, int tempoDeServico,
			String preferencia) {
		super(nome, cpf, salarioBase, matricula, tempoDeServico);
		linguagensEmQuePrograma = new ArrayList<String>();
		linguagemDePreferencia = preferencia;
	}


	/**
	 * Adiciona uma nova linguagem de programação conhecida pelo programador.
	 * 
	 * @param lp
	 *            A nova linguagem de programação que o programador
	 *            conhece.
	 */
	public void adicionaLinguagemConhecida(String lp) {
		if (!linguagensEmQuePrograma.contains(lp))
			linguagensEmQuePrograma.add(lp);
	}

	/**
	 * Indica a participação do programador em um projeto.
	 *
	 * @param projeto
	 *            O projeto em que o programador está inserido.
	 */
	public void atribuiProjeto(String projeto) {
		projetoAtual = projeto;
	}

	/**
	 * Este método computa o salário do programador.
	 *
	 * @return O salário do funcionário;
	 */
	public double computaSalario() {
		return getSalarioBase() * 1.5;
	}

	/**
	 * Recupera a linguagem de preferência do programador
	 * 
	 * @return A linguagem de preferência do programador
	 */
	public String getLinguagemDePreferencia() {
		return linguagemDePreferencia;
	}

	/**
	 * Atribui uma nova linguagem de preferência para o programador
	 * 
	 * @param linguagemDePreferencia
	 *            Novoa linguagem de preferência do programador
	 */
	public void setLinguagemDePreferencia(String linguagemDePreferencia) {
		this.linguagemDePreferencia = linguagemDePreferencia;
	}

	/**
	 * Representa um programador como String.
	 *
	 * @return A string que representa um programdor.
	 */
	public String toString() {

		return "Nome " + getNome() + ", cpf " + getCpf() + ",matricula " + getMatricula() + ", projeto " + projetoAtual;
	}
}
