package modelo;

public class JoanEtorriHegaldia {
	
	private String kode;
	private String airelinea;
	private String hasiairport;
	private String amaiairport;
	private double iraupena;
	private String irtordu;
	private String irtdata;
	private double prezio;
	
	
	private String bkode;
	private String bairelinea;
	private double bprezio;
	private double preziototala = prezio + bprezio;
	private double biraupena;
	private String birtordu;
	private String birtdata;
	
	
	
	
	
	public JoanEtorriHegaldia() {
		this.kode = "";
		this.airelinea = "";
		this.hasiairport = "";
		this.amaiairport = "";
		this.iraupena = 0.0;
		this.irtordu = "";
		this.irtdata = "";
		this.prezio = 0.0;
		this.bkode = "";
		this.bairelinea = "";
		this.bprezio = 0.0;
		this.preziototala = prezio + bprezio;
		this.biraupena = 0.0;
		this.birtordu = "";
		this.birtdata = "";
	}
	public JoanEtorriHegaldia(String kode, String airelinea, String hasiairport, String amaiairport, double iraupena,
			String irtordu, String irtdata, double prezio, String bkode, String bairelinea, double bprezio,
			double preziototala, double biraupena, String birtordu, String birtdata) {
		this.kode = kode;
		this.airelinea = airelinea;
		this.hasiairport = hasiairport;
		this.amaiairport = amaiairport;
		this.iraupena = iraupena;
		this.irtordu = irtordu;
		this.irtdata = irtdata;
		this.prezio = prezio;
		this.bkode = bkode;
		this.bairelinea = bairelinea;
		this.bprezio = bprezio;
		this.preziototala = prezio + bprezio;
		this.biraupena = biraupena;
		this.birtordu = birtordu;
		this.birtdata = birtdata;
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
		return hasiairport;
	}
	public void setHasiairport(String hasiairport) {
		this.hasiairport = hasiairport;
	}
	public String getAmaiairport() {
		return amaiairport;
	}
	public void setAmaiairport(String amaiairport) {
		this.amaiairport = amaiairport;
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
	public String getBkode() {
		return bkode;
	}
	public void setBkode(String bkode) {
		this.bkode = bkode;
	}
	public String getBairelinea() {
		return bairelinea;
	}
	public void setBairelinea(String bairelinea) {
		this.bairelinea = bairelinea;
	}
	public double getBprezio() {
		return bprezio;
	}
	public void setBprezio(double bprezio) {
		this.bprezio = bprezio;
	}
	public double getPreziototala() {
		return preziototala;
	}
	public void setPreziototala(double preziototala) {
		this.preziototala = preziototala;
	}
	public double getBiraupena() {
		return biraupena;
	}
	public void setBiraupena(double biraupena) {
		this.biraupena = biraupena;
	}
	public String getBirtordu() {
		return birtordu;
	}
	public void setBirtordu(String birtordu) {
		this.birtordu = birtordu;
	}
	public String getBirtdata() {
		return birtdata;
	}
	public void setBirtdata(String birtdata) {
		this.birtdata = birtdata;
	}
	@Override
	public String toString() {
		return "JoanEtorriHegaldia [kode=" + kode + ", airelinea=" + airelinea + ", hasiairport=" + hasiairport
				+ ", amaiairport=" + amaiairport + ", iraupena=" + iraupena + ", irtordu=" + irtordu + ", irtdata="
				+ irtdata + ", prezio=" + prezio + ", bkode=" + bkode + ", bairelinea=" + bairelinea + ", bprezio="
				+ bprezio + ", preziototala=" + preziototala + ", biraupena=" + biraupena + ", birtordu=" + birtordu
				+ ", birtdata=" + birtdata + "]";
	}
	
	
	
	
	
	
	
	
}
