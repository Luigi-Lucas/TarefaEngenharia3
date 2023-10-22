package model;

import abstracoes.Despesa;

public class DespesaVariavel extends Despesa{

	public DespesaVariavel(String descricao, double valor, String referencia) {
		this.descricao = descricao;
		this.valor = valor;
		this.referencia = referencia;
	}

	@Override
	public void registrarDesp(Despesa despesa) {
		
	}
}
