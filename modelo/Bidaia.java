package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bidaia {

	private String kode;
	private String izena;
	private String agkode;
	private String desk;
	private String bidmota;
	private String hdata;
	private String adata;
	private int iraupena;
	private String helmugakode;
	
	
	
	public Bidaia() {
		
		this.kode = "";
		this.izena = "";
		this.agkode = "";
		this.desk = "";
		this.bidmota = "";
		this.hdata = "";
		this.adata = "";
		this.iraupena = 0;
		this.helmugakode = "";
	}
	
	public Bidaia(String kode, String izena, String agkode, String desk, String bidmota, String hdata, String adata,
			int iraupena, String helmugakode) {
		
		this.kode = kode;
		this.izena = izena;
		this.agkode = agkode;
		this.desk = desk;
		this.bidmota = bidmota;
		this.hdata = hdata;
		this.adata = adata;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		long daysBetween = 0;

		try {
		    LocalDate hdatakalk = LocalDate.parse(hdata, dtf);
		    LocalDate adatakalk = LocalDate.parse(adata, dtf);
		    daysBetween = Duration.between(hdatakalk, adatakalk).toDays();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		this.iraupena = (int) daysBetween;
		
		this.helmugakode = helmugakode;
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
	public String getAgkode() {
		return agkode;
	}
	public void setAgkode(String agkode) {
		this.agkode = agkode;
	}
	public String getDesk() {
		return desk;
	}
	public void setDesk(String desk) {
		this.desk = desk;
	}
	public String getBidmota() {
		return bidmota;
	}
	public void setBidmota(String bidmota) {
		this.bidmota = bidmota;
	}
	public String getHdata() {
		return hdata;
	}
	public void setHdata(String hdata) {
		this.hdata = hdata;
	}
	public String getAdata() {
		return adata;
	}
	public void setAdata(String adata) {
		this.adata = adata;
	}
	public int getIraupena() {
		return iraupena;
	}
	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}
	public String getHelmugakode() {
		return helmugakode;
	}
	public void setHelmugakode(String helmugakode) {
		this.helmugakode = helmugakode;
	}
	
	@Override
	public String toString() {
		return "Bidaia [kode=" + kode + ", izena=" + izena + ", agkode=" + agkode + ", desk=" + desk + ", bidmota="
				+ bidmota + ", hdata=" + hdata + ", adata=" + adata + ", iraupena=" + iraupena + ", helmugakode="
				+ helmugakode + "]";
	}
	
	
	
	
}
