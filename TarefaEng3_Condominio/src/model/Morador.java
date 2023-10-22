package model;

import java.util.Set;

public class Morador {
	
	public Set<Locacao> locacao;
	private String nomeMorador;
	private String telMorador;
	
	public Morador(String nomeMorador, String telMorador) {
		this.nomeMorador = nomeMorador;
		this.telMorador = telMorador;
	}

	public String getNomeMorador() {
		return nomeMorador;
	}
	
	public void setNomeMorador(String nomeMorador) {
		this.nomeMorador = nomeMorador;
	}
	
	public String getTelMorador() {
		return telMorador;
	}
	
	public void setTelMorador(String telMorador) {
		this.telMorador = telMorador;
	}
}
