package model;

import java.util.Set;

import abstracoes.Despesa;

public class Cobranca {
	
	public Set<DespCobran> despCobran;
	private String referencia;
	private double valor;
	private double multa;
	private String dataPagamento;
	private Apartamento apartamento;
	private int i = 1;
	
	public Cobranca(String referencia, double multa, 
			String dataPagamento,Apartamento apartamento) {
		this.referencia = referencia;
		this.multa = multa;
		this.dataPagamento = dataPagamento;
		this.apartamento = apartamento;
	}

	public String getReferencia() {
		return this.referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getMulta() {
		return this.multa;
	}

	public void setMulta(double multa) {
		this.multa = multa;
	}

	public String getDataPagamento() {
		return this.dataPagamento;
	}

	public void setDataPagamento(String dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Apartamento getApartamento() {
		return this.apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public void calcularCondominio(Apartamento apto, Despesa desp, int somatorioQuartos) {
		double valor = desp.valor / somatorioQuartos * apto.getQtdQuartos();
		System.out.println("Despesa " + i + " -> descricao: " + desp.descricao + ", valor: " + valor + ", referencia: " + desp.referencia);
		this.valor += valor;
		i++;
	}

	public void receberPagamento(double valor, double multa) {
			
	}
}
