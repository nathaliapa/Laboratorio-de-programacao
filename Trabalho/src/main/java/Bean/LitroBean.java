package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class LitroBean {

	
	
	private Double combustivel;
	private Double cliente;
	
	
	public void Calculo() {
		double li = (cliente / combustivel);
		
		Messages.addGlobalInfo( li + " litros");

	}


	public Double getCombustivel() {
		return combustivel;
	}


	public void setCombustivel(Double combustivel) {
		this.combustivel = combustivel;
	}


	public Double getCliente() {
		return cliente;
	}


	public void setCliente(Double cliente) {
		this.cliente = cliente;
	}


	


}
