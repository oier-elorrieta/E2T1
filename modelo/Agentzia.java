package modelo;

public class Agentzia {

	private String kodea;
	private String izena;
	private String logo;
	private String markakolore;
	private int langkop;
	private String agmota;
	
	
	
	
	public Agentzia() {
		this.kodea = "";
		this.izena = "";
		this.logo = "";
		this.markakolore = "";
		this.langkop = 0;
		this.agmota = "";
	}
	
	public Agentzia(String kodea, String izena, String logo, String markakolore, int langkop, String agmota) {
		this.kodea = kodea;
		this.izena = izena;
		this.logo = logo;
		this.markakolore = markakolore;
		this.langkop = langkop;
		this.agmota = agmota;
	}
	
	public String getKodea() {
		return kodea;
	}
	public void setKodea(String kodea) {
		this.kodea = kodea;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getMarkakolore() {
		return markakolore;
	}
	public void setMarkakolore(String markakolore) {
		this.markakolore = markakolore;
	}
	public int getLangkop() {
		return langkop;
	}
	public void setLangkop(int langkop) {
		this.langkop = langkop;
	}
	public String getAgmota() {
		return agmota;
	}
	public void setAgmota(String agmota) {
		this.agmota = agmota;
	}
	
	@Override
	public String toString() {
		return "Agentzia [kodea=" + kodea + ", izena=" + izena + ", logo=" + logo + ", markakolore=" + markakolore
				+ ", langkop=" + langkop + ", agmota=" + agmota + "]";
	}
	
	
	
	
}
