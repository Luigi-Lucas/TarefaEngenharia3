package abstracoes;

import java.util.Set;
import model.DespApto;
import model.DespCobran;

public abstract class Despesa {
	
	public Despesa() {
		
	}
	
	public Set<DespCobran> despCobran;
	public Set<DespApto> gastos;
	public String descricao;
	public double valor;
	public String referencia;
	
	public abstract void registrarDesp(Despesa despesa);
}
