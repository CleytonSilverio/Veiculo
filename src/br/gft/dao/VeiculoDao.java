package br.gft.dao;

import java.util.ArrayList;
import java.util.List;

import br.gft.entidade.Veiculo;


public class VeiculoDao {
	
	private static List<Veiculo> carros = new ArrayList<Veiculo>();
	
	public Veiculo inserir (Veiculo carro) {
		carros.add(carro);
		return carro;
	}
	
	public List<Veiculo> listar(){
		return carros;
	}
	
	public Veiculo alterar(Veiculo carro) {
		
		return null;
	}

}
