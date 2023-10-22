package model;

public class DespCobran {

	private boolean foiPago;

	public DespCobran(boolean pago) {
		this.foiPago = pago;
	}

	public boolean getFoiPago() {
		return this.foiPago;
	}

	public void setFoiPago(boolean pago) {
		this.foiPago = pago;
	}
	
	public void verificarPag(Cobranca cobranca) {
		
	}
}
