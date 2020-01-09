package br.gft.acoes;

import br.gft.entidade.Veiculo;

public class Acelerar {
	
	public void AceleraTudo(Veiculo ve) {
		
		if(ve.isLigado() == true) {
			ve.setVelocidade(ve.getVelocidade() + 20);
			System.out.println("Veiculo acelerado para: " + ve.getVelocidade());
		}
		if(ve.isLigado() == false) {
			System.out.println("O carro não anda desligado!");
		}
		
	}
	
	public void pisaNoFreio(Veiculo ve) {
		if(ve.isLigado() == true) {
			if(ve.getLitrosCombustivel() >= 10) {
				if(ve.getVelocidade() > 0) {
					ve.setVelocidade(ve.getVelocidade() - 20);
					System.out.println("Veiculo desacelerado para: " + ve.getVelocidade());
					try {
						Thread.sleep(10);
						ve.setLitrosCombustivel(ve.getLitrosCombustivel()-10);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
		if(ve.isLigado() == true) {
			if(ve.getVelocidade() == 0) {
				System.out.println("Puxando freio de mão!");
			}
		}
	}

}
