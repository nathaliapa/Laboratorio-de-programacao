package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.omnifaces.util.Messages;

@ManagedBean
@ViewScoped
public class MediaBean {

	private String nome;
	private Double p1;
	private Double p2;
	
	
	public void Calculo() {
		double mf = (p1 + p2)/2;
		Messages.addGlobalInfo( "Boa noite" + nome +" A sua media é : " + mf + " ! ");

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getP1() {
		return p1;
	}

	public void setP1(Double p1) {
		this.p1 = p1;
	}

	public Double getP2() {
		return p2;
	}

	public void setP2(Double p2) {
		this.p2 = p2;
	}
	
	
	
	

}
