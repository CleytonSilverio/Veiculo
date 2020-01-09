package br.gft.acoes;

import java.util.Scanner;

import br.gft.entidade.Veiculo;

public class Abastecer {
	
	Scanner sc = new Scanner(System.in);
	
	public void completa(Veiculo ve) {
		if(ve.getLitrosCombustivel() == 100) {
			System.out.println("O veiculo já está com o tanque cheio!");
		}
		if(ve.isLigado() == false && ve.getLitrosCombustivel()<100) {
			System.out.println("Abastecendo o veiculo!");
			ve.setLitrosCombustivel(100);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Veiculo abastecido!");
		}
		if(ve.isLigado() == true) {
			System.out.println("Se abastecer com o veiculo ligado não enche! :)");
		}
		
	}

}
