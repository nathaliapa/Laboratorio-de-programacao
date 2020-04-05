package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class DolarBean {

	
	private Double dolar;
	private Double real;
	
	
	public void Calculo() {
		double re = (dolar *real);
		
		Messages.addGlobalInfo(  " Resultado: " + re);

	}


	public Double getDolar() {
		return dolar;
	}


	public void setDolar(Double dolar) {
		this.dolar = dolar;
	}


	public Double getReal() {
		return real;
	}


	public void setReal(Double real) {
		this.real = real;
	}
	
}
