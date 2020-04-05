package Bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class MultiplicacaoBean {

	
	private Integer p1;
	private Integer p2;
	private Integer p3;
	private Integer p4;
	
	public void Calculo() {
		int mf =  p1 *p3;
		int mf2 = p2 + p4;
		
		Messages.addGlobalInfo( "multiplicação: " + mf +"  ,Soma : " + mf2);

	}
	
	public Integer getP1() {
		return p1;
	}
	public void setP1(Integer p1) {
		this.p1 = p1;
	}
	public Integer getP2() {
		return p2;
	}
	public void setP2(Integer p2) {
		this.p2 = p2;
	}
	public Integer getP3() {
		return p3;
	}
	public void setP3(Integer p3) {
		this.p3 = p3;
	}
	public Integer getP4() {
		return p4;
	}
	public void setP4(Integer p4) {
		this.p4 = p4;
	}
		

}
