package main;

import model.Funcionario;
import model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Joao", 987654);
		System.out.println(p1.toString());
		
		p1.nome = "Jose";
		
		Pessoa p2;
            p2 = new Funcionario("Joao", 987654, 1500, 003, 4) {
                @Override
                public double computaSalario() {
                    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                }
            };
		System.out.println(p2.toString());
	}

}
