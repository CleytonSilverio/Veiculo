package br.gft.acoes;

import java.util.List;

import br.gft.dao.VeiculoDao;
import br.gft.entidade.Veiculo;

public class LigaDesliga {

	VeiculoDao dao = new VeiculoDao();
	List<Veiculo> carros = dao.listar();

	public void LigarCarro(Veiculo ve) throws Exception {

		if (ve.isLigado() == false) {
			System.out.println("Ligando veiculo");
			System.out.println("nhe nhe nhe nhe nhe nhe");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ve.setLigado(true);
			System.out.println("Veiculo ligado");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else if (ve.isLigado() == true) {
			System.out.println("Veiculo já está ligado");
			throw new Exception("Veiculo já está ligado");
		}

	}
	
	public void DesligaCarro(Veiculo ve) throws Exception {
		if(ve.isLigado() == true) {
			System.out.println("Desligando veiculo");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			ve.setLigado(false);
			System.out.println("\n\n");
			System.out.println("Veiculo desligado.");
		}
		else if(ve.isLigado() == false) {
			System.out.println("\n\n");
			System.out.println("Veiculo já está desligado!");
			throw new Exception("Veiculo já está desligado!");
		}
	}

}
