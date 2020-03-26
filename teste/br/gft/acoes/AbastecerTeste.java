package br.gft.acoes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

import br.gft.entidade.Veiculo;

public class AbastecerTeste {

	@Test
	public void abastecerFuncionando() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		try {
			new Abastecer().completa(ve);
		} catch (Exception e) {
			e.printStackTrace();
			Assert.fail();
		}
	}

	@Test
	public void erroAoAbastecerCompleto() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		ve.setLitrosCombustivel(100);
		try {
			new Abastecer().completa(ve);
		}catch(Exception e) {
			assertThat(e.getMessage(), is("Veiculo já se encontra com o tanque cheio!"));
		}
	}
	
	@Test
	public void erroAoAbastecerComOVeiculoLigado() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setPreco((double) 20000);
		ve.setLigado(true);
		try {
			new Abastecer().completa(ve);
		}catch(Exception e) {
			assertThat(e.getMessage(), is("Veiculo está ligado"));
		}
	}

}
