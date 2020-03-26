package br.gft.acoes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import br.gft.entidade.Veiculo;

public class LigarDesligarTeste {
	
	@Test
	public void ligarFuncionando() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		try {
			new LigaDesliga().LigarCarro(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void desligarFuncionando() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setLigado(true);
		ve.setPreco((double) 20000);
		try {
			new LigaDesliga().DesligaCarro(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}
	
	@Test
	public void desligarDesligado() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setLigado(false);
		ve.setPreco((double) 20000);
		try {
			new LigaDesliga().DesligaCarro(ve);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Veiculo já está desligado!"));
		}
	}
	
	@Test
	public void ligarLigado() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setLigado(true);
		ve.setPreco((double) 20000);
		try {
			new LigaDesliga().DesligaCarro(ve);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Veiculo já está ligado"));
		}
	}

}
