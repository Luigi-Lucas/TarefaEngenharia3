package model;

import java.util.Set;
import abstracoes.IResidente;

public class Apartamento {
	
	public Set<DespApto> gastos;
	public Set<Locacao> locacao;
	private int numApto;
	private int qtdQuartos;

	public Apartamento(int numApto, int qtdQuartos) {
		this.numApto = numApto;
		this.qtdQuartos = qtdQuartos;
	}

	public int getNumApto() {
		return numApto;
	}

	public void setNumApto(int numApto) {
		this.numApto = numApto;
	}

	public int getQtdQuartos() {
		return qtdQuartos;
	}

	public void setQtdQuartos(int qtdQuartos) {
		this.qtdQuartos = qtdQuartos;
	}
	
	public void registrarApto(Apartamento apto, IResidente prop) {
		
	}
}
