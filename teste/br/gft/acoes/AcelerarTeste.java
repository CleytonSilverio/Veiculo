package br.gft.acoes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import br.gft.entidade.Veiculo;

public class AcelerarTeste {
	
	@Test
	public void acelerarFuncionando() {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		ve.setLigado(true);
		try {
			new Acelerar().AceleraTudo(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void naoAceleraDesligado() {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		try {
			new Acelerar().AceleraTudo(ve);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Veiculo desligado."));
		}
	}
	
	@Test
	public void freiar() {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setVelocidade(20);
		ve.setPreco((double) 20000);
		try {
			new Acelerar().pisaNoFreio(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void puxarFreioDeMao() {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		ve.setVelocidade(0);
		ve.setLigado(true);
		try {
			new Acelerar().pisaNoFreio(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

}
