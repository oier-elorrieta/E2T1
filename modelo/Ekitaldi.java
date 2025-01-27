package modelo;

public class Ekitaldi {

	private String ekikode;
	private String izena;
	private String bidaikode;
	
	
//----------OSTATUA--------------
	

	private String hotizena;
	private String hiria;
	private double osprezio;
	private String ossardata;
	private String osirtdata;
	private String logelamotakod;
	
//---------JARDUERA---------------
	
	private String jardesk;
	private String jardata;
	private double jarprezio;
	
	
//--------JOANEKO--HEGALDIA----
	private String hkode;
	private String airelinea;
	private String jatairportkod;
	private String helairportkod;
	private double iraupena;
	private String irtordu;
	private String irtdata;
	private double hprezio;
	
	
	
//------JOAN-ETORRI-------
	
	private String bkode;
	private String bairelinea;
	private String bhasiairportkod;
	private String bamaiairportkod;
	private double bprezio;
	private double preziototala = hprezio + bprezio;
	private double biraupena;
	private String birtordu;
	private String birtdata;
	
	
	
	
	
	
	
	
	
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
	public String getBidaikode() {
		return bidaikode;
	}
	public void setBidaikode(String bidaikode) {
		this.bidaikode = bidaikode;
	}
	public String getHotizena() {
		return hotizena;
	}
	public void setHotizena(String hotizena) {
		this.hotizena = hotizena;
	}
	public String getHiria() {
		return hiria;
	}
	public void setHiria(String hiria) {
		this.hiria = hiria;
	}
	public double getOsprezio() {
		return osprezio;
	}
	public void setOsprezio(double osprezio) {
		this.osprezio = osprezio;
	}
	public String getOssardata() {
		return ossardata;
	}
	public void setOssardata(String ossardata) {
		this.ossardata = ossardata;
	}
	public String getOsirtdata() {
		return osirtdata;
	}
	public void setOsirtdata(String osirtdata) {
		this.osirtdata = osirtdata;
	}
	public String getLogelamotakod() {
		return logelamotakod;
	}
	public void setLogelamotakod(String logelamotakod) {
		this.logelamotakod = logelamotakod;
	}
	public String getJardesk() {
		return jardesk;
	}
	public void setJardesk(String jardesk) {
		this.jardesk = jardesk;
	}
	public String getJardata() {
		return jardata;
	}
	public void setJardata(String jardata) {
		this.jardata = jardata;
	}
	public double getJarprezio() {
		return jarprezio;
	}
	public void setJarprezio(double jarprezio) {
		this.jarprezio = jarprezio;
	}
	public String getHkode() {
		return hkode;
	}
	public void setHkode(String hkode) {
		this.hkode = hkode;
	}
	public String getAirelinea() {
		return airelinea;
	}
	public void setAirelinea(String airelinea) {
		this.airelinea = airelinea;
	}
	public String getJatairportkod() {
		return jatairportkod;
	}
	public void setJatairportkod(String jatairportkod) {
		this.jatairportkod = jatairportkod;
	}
	public String getHelairportkod() {
		return helairportkod;
	}
	public void setHelairportkod(String helairportkod) {
		this.helairportkod = helairportkod;
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
	public double getHprezio() {
		return hprezio;
	}
	public void setHprezio(double hprezio) {
		this.hprezio = hprezio;
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
	public String getBhasiairportkod() {
		return bhasiairportkod;
	}
	public void setBhasiairportkod(String bhasiairportkod) {
		this.bhasiairportkod = bhasiairportkod;
	}
	public String getBamaiairportkod() {
		return bamaiairportkod;
	}
	public void setBamaiairportkod(String bamaiairportkod) {
		this.bamaiairportkod = bamaiairportkod;
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

	
	public String toStringOstatua() {
		return "Ekitaldi [ekikode=" + ekikode + ", izena=" + izena + ", bidaikode=" + bidaikode + ", hotizena="
				+ hotizena + ", hiria=" + hiria + ", osprezio=" + osprezio + ", ossardata=" + ossardata + ", osirtdata="
				+ osirtdata + "]";
	}
	
	public String toStringJarduera() {
		return "Ekitaldi [ekikode=" + ekikode + ", izena=" + izena + ", bidaikode=" + bidaikode + ", jardesk=" + jardesk
				+ ", jardata=" + jardata + ", jarprezio=" + jarprezio + "]";
	}

	public String toStringJoan() {
		return "Ekitaldi [ekikode=" + ekikode + ", izena=" + izena + ", bidaikode=" + bidaikode + ", hkode=" + hkode
				+ ", airelinea=" + airelinea + ", jatairportkod=" + jatairportkod + ", helairportkod=" + helairportkod
				+ ", iraupena=" + iraupena + ", irtordu=" + irtordu + ", irtdata=" + irtdata + ", hprezio=" + hprezio
				+ "]";
	}
	
	public String toStringJoanEtorri() {
		return "Ekitaldi [ekikode=" + ekikode + ", izena=" + izena + ", bidaikode=" + bidaikode + ", hkode=" + hkode
				+ ", airelinea=" + airelinea + ", jatairportkod=" + jatairportkod + ", helairportkod=" + helairportkod
				+ ", iraupena=" + iraupena + ", irtordu=" + irtordu + ", irtdata=" + irtdata + ", hprezio=" + hprezio
				+ ", bkode=" + bkode + ", bairelinea=" + bairelinea + ", bhasiairportkod=" + bhasiairportkod
				+ ", bamaiairportkod=" + bamaiairportkod + ", bprezio=" + bprezio + ", preziototala=" + preziototala
				+ ", biraupena=" + biraupena + ", birtordu=" + birtordu + ", birtdata=" + birtdata + "]";
	}
	
	
	
	
	
	
	
	
}
