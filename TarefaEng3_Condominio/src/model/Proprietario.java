package model;

import abstracoes.IResidente;

public class Proprietario implements IResidente{
	
	private String nomeProp;
	private String telProp;
	
	public Proprietario(String nomeProp, String telProp) {
		this.nomeProp = nomeProp;
		this.telProp = telProp;
	}

	public String getNomeProp() {
		return nomeProp;
	}

	public void setNomeProp(String nomeProp) {
		this.nomeProp = nomeProp;
	}

	public String getTelProp() {
		return telProp;
	}

	public void setTelProp(String telProp) {
		this.telProp = telProp;
	}
	
	@Override
	public void pagarCobranca(double valor) {
		
	}

	@Override
	public void cadastrarProp(Proprietario prop) {
		
	}
}
