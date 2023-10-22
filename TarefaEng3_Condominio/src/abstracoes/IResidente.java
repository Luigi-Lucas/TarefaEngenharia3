package abstracoes;

import model.Proprietario;

public interface IResidente {
	
	public void cadastrarProp(Proprietario prop);
	
	public void pagarCobranca(double valor);
}
