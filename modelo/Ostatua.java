package modelo;

public class Ostatua {

	private String ekikode;
	private String izena;
	private String hiria;
	private double prezio;
	private String sardata;
	private String irtdata;
	private String logelamotakod;
	
	
	
	
	
	
	
	
	public Ostatua() {
		this.ekikode = "";
		this.izena = "";
		this.hiria = "";
		this.prezio = 0.0;
		this.sardata = "";
		this.irtdata = "";
		this.logelamotakod = "";
	}
		
	public Ostatua(String ekikode, String izena, String hiria, double prezio, String sardata, String irtdata,
			String logelamotakod) {
		this.ekikode = ekikode;
		this.izena = izena;
		this.hiria = hiria;
		this.prezio = prezio;
		this.sardata = sardata;
		this.irtdata = irtdata;
		this.logelamotakod = logelamotakod;
	}
	
	public String getEkikode() {
		return ekikode;
	}
	public void setEkikode(String ekikode) {
		this.ekikode = ekikode;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getHiria() {
		return hiria;
	}
	public void setHiria(String hiria) {
		this.hiria = hiria;
	}
	public double getPrezio() {
		return prezio;
	}
	public void setPrezio(double prezio) {
		this.prezio = prezio;
	}
	public String getSardata() {
		return sardata;
	}
	public void setSardata(String sardata) {
		this.sardata = sardata;
	}
	public String getIrtdata() {
		return irtdata;
	}
	public void setIrtdata(String irtdata) {
		this.irtdata = irtdata;
	}
	public String getLogelamotakod() {
		return logelamotakod;
	}
	public void setLogelamotakod(String logelamotakod) {
		this.logelamotakod = logelamotakod;
	}
	@Override
	public String toString() {
		return "Ostatua [ekikode=" + ekikode + ", izena=" + izena + ", hiria=" + hiria + ", prezio=" + prezio
				+ ", sardata=" + sardata + ", irtdata=" + irtdata + ", logelamotakod=" + logelamotakod + "]";
	}
	
	
	
	
}
