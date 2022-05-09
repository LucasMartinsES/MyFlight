package pucrs.myflight.consoleApp;

import java.util.ArrayList;
import pucrs.myflight.modelo.Aeronave;
import pucrs.myflight.modelo.Aeroporto;
import pucrs.myflight.modelo.Geo;
import pucrs.myflight.modelo.GerenciadorAeronaves;
import pucrs.myflight.modelo.GerenciadorAeroportos;

public class App {

	public static void main(String[] args) {
		//System.out.println("\nMyFlight project...");
		/*
		/ Cria 3 aeronaves, adiciona elas no ArrayList, imprime todas na tela e faz uma pesquisa pelo codigo
		*/
        Aeronave nave1 = new Aeronave("001", "Airbus A300");
		Aeronave nave2 = new Aeronave("002", "Curtiss C-46");
		Aeronave nave3 = new Aeronave("003", "Boeing 737");
		GerenciadorAeronaves gerAvioes = new GerenciadorAeronaves();
		gerAvioes.adicionar(nave1);
		gerAvioes.adicionar(nave2);
		gerAvioes.adicionar(nave3);

		ArrayList<Aeronave> listaAeronave;
		listaAeronave = gerAvioes.listarTodas();
		if(listaAeronave != null){
			System.out.println("Lista das Aeronaves: \n" + listaAeronave.toString());
		} else {
			System.out.println("Lista vazia!");
		}

		System.out.printf("\n");
		Aeronave searchAeronave;
		searchAeronave = gerAvioes.buscarPorCodigo("002");
		System.out.println("Pesquisando sobre a Aeronave 002...");
		if (searchAeronave != null){
			System.out.println("	" + searchAeronave.toString());
		} else {
			System.out.println("Aviao nao cadastrado!");
		}

		/*
		/	Localizacao com latitude e longitude dos aeroportos
		*/
		Geo Geo1 = new Geo(-29.993512643922035, -51.17532548506502);	//Aeroporto Porto Alegre
		Geo Geo2 = new Geo(-34.8366915029989, -56.01612615812663);		//Aeroporto Montevideo
		Geo Geo3 = new Geo(-27.670089477275823, -48.54597643080129);	//Aeroporto Florianopolis

		/*
		/ Cria 3 aeroportos, adiciona elas no ArrayList, imprime todas na tela e faz uma pesquisa pelo codigo
		*/

		Aeroporto aeroporto1 = new Aeroporto("1-001", "Porto Alegre International Airport Salgado Filho", Geo1);
		Aeroporto aeroporto2 = new Aeroporto("2-002", "Montevideo International Airport Carrasco", Geo2);
		Aeroporto aeroporto3 = new Aeroporto("1-003", "Florianópolis International Airport Hercílio Luz", Geo3);
		GerenciadorAeroportos gerAeroportos = new GerenciadorAeroportos();
		gerAeroportos.adicionar(aeroporto1);
		gerAeroportos.adicionar(aeroporto2);
		gerAeroportos.adicionar(aeroporto3);

		ArrayList<Aeroporto> listaAero;
		listaAero = gerAeroportos.listarTodos();
		if(listaAero != null){
			System.out.println("Lista dos Aeroportos: \n" + listaAero.toString());
		} else {
			System.out.println("Lista vazia!");
		}
		System.out.printf("\n");

		Aeroporto searchAero;
		searchAero = gerAeroportos.buscarPorCodigo("1-003");
		System.out.println("Pesquisando sobre o Aeroporto 1-003...");
		if (searchAero != null){
			System.out.println("	" + searchAero.toString());
		} else {
			System.out.println("Aeroporto nao presente nos cadastros!");
		}


		System.out.println("\n");
		System.out.println("Ordem por nome de aeroportos");
		gerAeroportos.ordemNomeAeroportos();

	}
}
