package pucrs.myflight.modelo;

public class Aeroporto implements Comparable<Aeroporto> {
	private String codigo;
	private String nome;
	private Geo loc;
	
	public Aeroporto(String codigo, String nome, Geo loc) {
		this.codigo = codigo;
		this.nome = nome;
		this.loc = loc;
	}
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Geo getLocal() {
		return loc;
	}

	public String toString(){
		return codigo + ": " + nome + " - localizacao: Latitude = " + loc.getLatitude() + " Longitude = " +loc.getLongitude() + "\n";
	}

	/*
	/	Metodo para utilizar o metodo comparableTo() 
	*/

	public int compareTo(Aeroporto ordem){
		return nome.compareTo(ordem.nome);
	}
}
