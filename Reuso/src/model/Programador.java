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
	 * Adiciona uma nova linguagem de programa��o conhecida pelo programador.
	 * 
	 * @param lp
	 *            A nova linguagem de programa��o que o programador
	 *            conhece.
	 */
	public void adicionaLinguagemConhecida(String lp) {
		if (!linguagensEmQuePrograma.contains(lp))
			linguagensEmQuePrograma.add(lp);
	}

	/**
	 * Indica a participa��o do programador em um projeto.
	 *
	 * @param projeto
	 *            O projeto em que o programador est� inserido.
	 */
	public void atribuiProjeto(String projeto) {
		projetoAtual = projeto;
	}

	/**
	 * Este m�todo computa o sal�rio do programador.
	 *
	 * @return O sal�rio do funcion�rio;
	 */
	public double computaSalario() {
		return getSalarioBase() * 1.5;
	}

	/**
	 * Recupera a linguagem de prefer�ncia do programador
	 * 
	 * @return A linguagem de prefer�ncia do programador
	 */
	public String getLinguagemDePreferencia() {
		return linguagemDePreferencia;
	}

	/**
	 * Atribui uma nova linguagem de prefer�ncia para o programador
	 * 
	 * @param linguagemDePreferencia
	 *            Novoa linguagem de prefer�ncia do programador
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
