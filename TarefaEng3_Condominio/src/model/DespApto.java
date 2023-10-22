package model;

import abstracoes.Despesa;

public class DespApto {
	
	private Despesa despesa;
	private Apartamento apartamento;
	
	public DespApto(Despesa despesa, Apartamento apartamento) {
		this.despesa = despesa;
		this.apartamento = apartamento;
	}

	public Despesa getDespesa() {
		return this.despesa;
	}

	public void setDespesa(Despesa despesa) {
		this.despesa = despesa;
	}

	public Apartamento getApartamento() {
		return this.apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

}
