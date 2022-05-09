package pucrs.myflight.modelo;

public class Aeronave implements Contavel{
	private String codigo;
	private String descricao;
	private static int totalAeronaves = 0;	//Atributo de classe para armazenar o numero total de Aeronaves instanciadas
	
	public Aeronave(String codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
		totalAeronaves++;					// Quando uma aeronave for instanciada, ela eh somada ao total
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public String toString(){
		return codigo + ": " + descricao + "\n";
	}

	/*
	/ Metodo de interface criado dia 09/05 - Lucca
	*/
	public int qtdAeronaves(){
		return totalAeronaves;
	}
}
