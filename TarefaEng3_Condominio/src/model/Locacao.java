package model;

import java.time.LocalDate;

public class Locacao {
	
	private LocalDate dataInicio;
	private LocalDate dataFim;
	
	public Locacao(LocalDate dataInicio, LocalDate dataFim) {
		super();
		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
	}

	public LocalDate getDataInicio() {
		return this.dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return this.dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}
}
