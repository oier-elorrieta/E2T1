package modelo;

public class Ostatua {

	private String ekikod;
	private String hotizena;
	private String hiria;
	private double prezio;
	private String sardata;
	private String irtdata;
	private String logelamotakod;
	
	
	
	public Ostatua() {
		this.ekikod = "";
		this.hotizena = "";
		this.hiria = "";
		this.prezio = 0.0;
		this.sardata = "";
		this.irtdata = "";
		this.logelamotakod = "";
	}
		
	public Ostatua(String ekikode, String izena, String hiria, double prezio, String sardata, String irtdata,
			String logelamotakod) {
		this.ekikod = ekikode;
		this.hotizena = izena;
		this.hiria = hiria;
		this.prezio = prezio;
		this.sardata = sardata;
		this.irtdata = irtdata;
		this.logelamotakod = logelamotakod;
	}
	
	public String getEkikode() {
		return ekikod;
	}
	public void setEkikode(String ekikode) {
		this.ekikod = ekikode;
	}
	public String getIzena() {
		return hotizena;
	}
	public void setIzena(String izena) {
		this.hotizena = izena;
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
		return "Ostatua [ekikode=" + ekikod + ", izena=" + hotizena + ", hiria=" + hiria + ", prezio=" + prezio
				+ ", sardata=" + sardata + ", irtdata=" + irtdata + ", logelamotakod=" + logelamotakod + "]";
	}
	
	
	
	
}
