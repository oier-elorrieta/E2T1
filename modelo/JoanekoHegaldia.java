package modelo;

public class JoanekoHegaldia {
	
	private String ekikode;
	private String kode;
	private String airelinea;
	private String jatairportkod;
	private String helairportkod;
	private double iraupena;
	private String irtordu;
	private String irtdata;
	private double prezio;
	
	
	public JoanekoHegaldia() {
		this.kode = "";
		this.airelinea = "";
		this.jatairportkod = "";
		this.helairportkod = "";
		this.iraupena = 0.0;
		this.irtordu = "";
		this.irtdata = "";
		this.prezio = 0.0;
	}
	
	public JoanekoHegaldia(String kode, String airelinea, String hasiairport, String amaiairport, double iraupena,
			String irtordu, String irtdata, double prezio) {
		this.kode = kode;
		this.airelinea = airelinea;
		this.jatairportkod = hasiairport;
		this.helairportkod = amaiairport;
		this.iraupena = iraupena;
		this.irtordu = irtordu;
		this.irtdata = irtdata;
		this.prezio = prezio;
	}
	
	
	
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
	}
	public String getAirelinea() {
		return airelinea;
	}
	public void setAirelinea(String airelinea) {
		this.airelinea = airelinea;
	}
	public String getHasiairport() {
		return jatairportkod;
	}
	public void setHasiairport(String hasiairport) {
		this.jatairportkod = hasiairport;
	}
	public String getAmaiairport() {
		return helairportkod;
	}
	public void setAmaiairport(String amaiairport) {
		this.helairportkod = amaiairport;
	}
	public double getIraupena() {
		return iraupena;
	}
	public void setIraupena(double iraupena) {
		this.iraupena = iraupena;
	}
	public String getIrtordu() {
		return irtordu;
	}
	public void setIrtordu(String irtordu) {
		this.irtordu = irtordu;
	}
	public String getIrtdata() {
		return irtdata;
	}
	public void setIrtdata(String irtdata) {
		this.irtdata = irtdata;
	}
	public double getPrezio() {
		return prezio;
	}
	public void setPrezio(double prezio) {
		this.prezio = prezio;
	}
	@Override
	public String toString() {
		return "JoanekoHegaldia [kode=" + kode + ", airelinea=" + airelinea + ", hasiairport=" + jatairportkod
				+ ", amaiairport=" + helairportkod + ", iraupena=" + iraupena + ", irtordu=" + irtordu + ", irtdata="
				+ irtdata + ", prezio=" + prezio + "]";
	}
	
	

}
