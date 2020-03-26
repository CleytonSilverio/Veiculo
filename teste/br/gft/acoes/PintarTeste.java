package br.gft.acoes;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import br.gft.entidade.Veiculo;

public class PintarTeste {
	
	@Test
	public void pintarLigado() throws Exception {
		Veiculo ve = new Veiculo();
		ve.setCor("branco");
		ve.setKm(200);
		ve.setMarca("marca");
		ve.setModelo("modelo");
		ve.setPlaca("abc-123");
		ve.setLigado(true);
		ve.setPreco((double) 20000);
		try {
			new Pintar().mudaCor(ve);
		} catch (Exception e) {
			assertThat(e.getMessage(), is("Não podemos pintar com o veiculo ligado!"));
		}
	}

}
