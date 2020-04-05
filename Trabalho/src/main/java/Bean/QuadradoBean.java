package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class QuadradoBean {

	
	
	private Integer p1;
	
	
	
	public void Calculo() {
		int mf = p1 *p1;
		
		Messages.addGlobalInfo( " o quadrado é : " + mf );

	}


	public Integer getP1() {
		return p1;
	}

	public void setP1(Integer p1) {
		this.p1 = p1;
	}


	

}
