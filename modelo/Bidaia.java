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
	private String hasidata;
	private String adata;
	private int iraupena;
	private String herrihelmugakode;
	
	
	
	public Bidaia() {
		
		this.kode = "";
		this.izena = "";
		this.agkode = "";
		this.desk = "";
		this.bidmota = "";
		this.hasidata = "";
		this.adata = "";
		this.iraupena = 0;
		this.herrihelmugakode = "";
	}
	
	public Bidaia(String kode, String izena, String agkode, String desk, String bidmota, String hasidata, String amaidata,
			int iraupena, String helmugakode) {
		
		this.kode = kode;
		this.izena = izena;
		this.agkode = agkode;
		this.desk = desk;
		this.bidmota = bidmota;
		this.hasidata = hasidata;
		this.adata = amaidata;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd MM yyyy");
		long daysBetween = 0;

		try {
		    LocalDate hasidatakalk = LocalDate.parse(hasidata, dtf);
		    LocalDate amaidatakalk = LocalDate.parse(amaidata, dtf);
		    daysBetween = Duration.between(hasidatakalk, amaidatakalk).toDays();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		this.iraupena = (int) daysBetween;
		
		this.herrihelmugakode = helmugakode;
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
		return hasidata;
	}
	public void setHdata(String hdata) {
		this.hasidata = hdata;
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
		return herrihelmugakode;
	}
	public void setHelmugakode(String helmugakode) {
		this.herrihelmugakode = helmugakode;
	}
	
	@Override
	public String toString() {
		return "Bidaia [kode=" + kode + ", izena=" + izena + ", agkode=" + agkode + ", desk=" + desk + ", bidmota="
				+ bidmota + ", hdata=" + hasidata + ", adata=" + adata + ", iraupena=" + iraupena + ", helmugakode="
				+ herrihelmugakode + "]";
	}
	
	
	
	
}
