package br.gft.principal;

import java.util.Scanner;

import br.gft.acoes.Abastecer;
import br.gft.acoes.LigaDesliga;
import br.gft.acoes.Pintar;
import br.gft.dao.VeiculoDao;
import br.gft.entidade.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Veiculo ve = new Veiculo();
		int cadastro=0;
		if(cadastro == 0) {
			System.out.println("Por favor insira um carro!");
			System.out.println("Marca: ");
			String marca = sc.next();
			marca += sc.nextLine();
			ve.setMarca(marca);
			System.out.println("Modelo: ");
			String modelo = sc.next();
			modelo += sc.nextLine();
			ve.setModelo(modelo);
			System.out.println("Placa: ");
			String placa = sc.next();
			placa += sc.nextLine();
			ve.setPlaca(placa);
			System.out.println("Cor: ");
			String cor = sc.next();
			cor += sc.nextLine();
			ve.setCor(cor);
			System.out.println("Kilometragem: ");
			float km = sc.nextFloat();
			ve.setKm(km);
			System.out.println("Valor: ");
			Double preco = sc.nextDouble();
			ve.setPreco(preco);
			
			VeiculoDao dao = new VeiculoDao();
			dao.inserir(ve);
		}
		
		
		
		for(;;) {
			
			//Menu
			System.out.println("1 - Ligar");
			System.out.println("2 - Desligar");
			System.out.println("3 - Abastecer");
			System.out.println("4 - Acelerar");
			System.out.println("5 - Frear");
			System.out.println("6 - Pintar");
			System.out.println("Digite o numero correspondente com o  que deseja efetuar com o veiculo: ");
			int opcao = sc.nextInt();
			//fim do menu
			
			//opção de ligar
			if(opcao == 1) {
				new LigaDesliga().LigarCarro(ve);
			}
			
			//fim da opção 1
			
			//opção 2
			if(opcao == 2) {
				new LigaDesliga().DesligaCarro(ve);
			}
			//fim da opção 2
			
			//opcao 3
			if (opcao == 3) {
				new Abastecer().completa(ve);
			}
			
			//opção 6
			if(opcao == 6) {
				new Pintar().mudaCor(ve);
			}
			//fim da opcao 6
			
		}

	}

}
