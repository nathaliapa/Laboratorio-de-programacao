package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class TemperaturaBean {

	
	
	private Double c;
	
	
	
	public void Calculo() {
		double f = (9 * c + 160) / 5;
		
		Messages.addGlobalInfo("  em graus Fahrenheit : " + f);

	}

	public Double getC() {
		return c;
	}



	public void setC(Double c) {
		this.c = c;
	}

}
