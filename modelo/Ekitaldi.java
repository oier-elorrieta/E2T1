package modelo;

public class Ekitaldi {

	private String kode;
	private String izena;
	private String bidaikode;
	private String ekimota;
	
	
	
	
	public Ekitaldi() {
		this.kode = "";
		this.izena = "";
		this.bidaikode = "";
		this.ekimota = "";
	}
	
	public Ekitaldi(String kode, String izena, String bidaikode, String ekimota) {
		this.kode = kode;
		this.izena = izena;
		this.bidaikode = bidaikode;
		this.ekimota = ekimota;
	}
	public String getKode() {
		return kode;
	}
	public void setKode(String kode) {
		this.kode = kode;
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
	public String getEkimota() {
		return ekimota;
	}
	public void setEkimota(String ekimota) {
		this.ekimota = ekimota;
	}
	@Override
	public String toString() {
		return "Ekitaldi [kode=" + kode + ", izena=" + izena + ", bidaikode=" + bidaikode + ", ekimota=" + ekimota
				+ "]";
	}
	
	
}
