package model;
import java.lang.reflect.GenericArrayType;

public class Pessoa {	
	public String nome;
	private int cpf;
	
	public Pessoa(String nome, int cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "Nome: " + getNome() + ", cpf: " + getCpf();
	}
}
