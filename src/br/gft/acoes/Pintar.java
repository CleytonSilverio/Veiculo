package br.gft.acoes;

import java.util.Scanner;

import br.gft.entidade.Veiculo;

public class Pintar {
	
	Scanner sc = new Scanner(System.in);
	
	public void mudaCor(Veiculo ve) {
		if(ve.isLigado() == false) {
			System.out.println("Por favor digite a nova cor do veiculo: ");
			String cor = sc.next();
			cor += sc.nextLine();
			ve.setCor(cor);
			System.out.println("Cor alterada para: " + cor);
		}
		else {
			System.out.println("Não podemos pintar com o veiculo ligado!");
		}
		
	}

}
