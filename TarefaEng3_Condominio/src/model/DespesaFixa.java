package model;

import abstracoes.Despesa;

public class DespesaFixa extends Despesa{

	public DespesaFixa(String descricao, double valor, String referencia) {
		this.descricao = descricao;
		this.valor = valor;
		this.referencia = referencia;
	}

	@Override
	public void registrarDesp(Despesa despesa) {
		
	}
}
