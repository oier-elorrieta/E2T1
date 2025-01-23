package modelo;

public class Jarduera {

	
	private String ekikod;
	private String izena;
	private String desk;
	private String ekidata;
	private double prezio;
	
	
public Jarduera() {
		
		this.ekikod = "";
		this.izena = "";
		this.desk = "";
		this.ekidata = "";
		this.prezio = 0.0;
	}
		
	public Jarduera(String ekikod, String izena, String desk, String ekidata, double prezio) {
		
		this.ekikod = ekikod;
		this.izena = izena;
		this.desk = desk;
		this.ekidata = ekidata;
		this.prezio = prezio;
	}
	
	
	public String getEkikod() {
		return ekikod;
	}
	public void setEkikod(String ekikod) {
		this.ekikod = ekikod;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getDesk() {
		return desk;
	}
	public void setDesk(String desk) {
		this.desk = desk;
	}
	public String getEkidata() {
		return ekidata;
	}
	public void setEkidata(String ekidata) {
		this.ekidata = ekidata;
	}
	public double getPrezio() {
		return prezio;
	}
	public void setPrezio(double prezio) {
		this.prezio = prezio;
	}
	
	@Override
	public String toString() {
		return "Jarduera [ekikod=" + ekikod + ", izena=" + izena + ", desk=" + desk + ", ekidata=" + ekidata
				+ ", prezio=" + prezio + "]";
	}
	
	
	
	
}
