package modelo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Bidai {

	private int kode;
	private String izena;
	private String agkode;
	private String desk;
	private String zerbez;
	private String bidmota;
	private String hasidata;
	private String amaidata;
	private int iraupena;
	private String herrihelmuga;
	private ArrayList<Ekitaldi> ekitaldiak;
	
	
	public void sartuEkitaldia(Ekitaldi ekiberri) {
		ekitaldiak.add(ekiberri);
	}
	
	
	
	public Bidai(int kode, String izena, String agkode, String desk, String bidmota, String hasidata, String amaidata,
			int iraupena, String helmugakode) {
		
		this.kode = kode;
		this.izena = izena;
		this.agkode = agkode;
		this.desk = desk;
		this.bidmota = bidmota;
		this.hasidata = hasidata;
		this.amaidata = amaidata;
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
		
		this.herrihelmuga = helmugakode;
	}
	
	
	
	
	public String getZerbez() {
		return zerbez;
	}


	public void setZerbez(String zerbez) {
		this.zerbez = zerbez;
	}


	public String getHasidata() {
		return hasidata;
	}


	public void setHasidata(String hasidata) {
		this.hasidata = hasidata;
	}


	public String getAmaidata() {
		return amaidata;
	}


	public void setAmaidata(String amaidata) {
		this.amaidata = amaidata;
	}


	public String getHerrihelmuga() {
		return herrihelmuga;
	}


	public void setHerrihelmuga(String herrihelmuga) {
		this.herrihelmuga = herrihelmuga;
	}


	public ArrayList<Ekitaldi> getEkitaldiak() {
		return ekitaldiak;
	}


	public int getKode() {
		return kode;
	}
	public void setKode(int kode) {
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
		return amaidata;
	}
	public void setAdata(String adata) {
		this.amaidata = adata;
	}
	public int getIraupena() {
		return iraupena;
	}
	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}
	public String getHelmugakode() {
		return herrihelmuga;
	}
	public void setHelmugakode(String helmugakode) {
		this.herrihelmuga = helmugakode;
	}
	
	@Override
	public String toString() {
		return "Bidaia [kode=" + kode + ", izena=" + izena + ", agkode=" + agkode + ", desk=" + desk + ", bidmota="
				+ bidmota + ", hdata=" + hasidata + ", adata=" + amaidata + ", iraupena=" + iraupena + ", helmugakode="
				+ herrihelmuga + "]";
	}
	
	
	
	
}
