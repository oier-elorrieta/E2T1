package modelo;

public class Hiria {

	private String kode;
	private String izena;
	
	
	public Hiria(String kode, String izena) {
		super();
		this.kode = kode;
		this.izena = izena;
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
	@Override
	public String toString() {
		return "Hiria [kode=" + kode + ", izena=" + izena + "]";
	}
	
	
}
