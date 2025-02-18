package modelo;


import java.util.ArrayList;

public class Bidai {

	private int kode;
	private String izena;
	private int agkode;
	private String desk;
	private String zerbez;
	private String bidmota;
	private String hasidata;
	private String amaidata;
	private int iraupena;
	private String herrihelmuga;
	private int selectedindx;
	private ArrayList<Ekitaldi> ekitaldiak = new ArrayList<Ekitaldi>();
	
	
	public void sartuEkitaldia(Ekitaldi ekiberri) {
		ekitaldiak.add(ekiberri);
	}
	
	public Bidai(int kode, String izena, int agkode, String desk, String zerbez, String bidmota, String hasidata, String amaidata,
			String helmugakode) {
		
		this.kode = kode;
		this.izena = izena;
		this.agkode = agkode;
		this.desk = desk;
		this.zerbez = zerbez;
		this.bidmota = bidmota;
		this.hasidata = hasidata;
		this.amaidata = amaidata;
		this.herrihelmuga = helmugakode;
		
	
	}
	
	public Bidai(String izena, int agkode, String desk, String zerbez, String bidmota, String hasidata, String amaidata,
			String helmugakode) {
		
		this.kode = 0;
		this.izena = izena;
		this.agkode = agkode;
		this.desk = desk;
		this.zerbez = zerbez;
		this.bidmota = bidmota;
		this.hasidata = hasidata;
		this.amaidata = amaidata;
		this.herrihelmuga = helmugakode;
		
	
	}
	
	
	
	
	public int getSelectedindx() {
		return selectedindx;
	}

	public void setSelectedindx(int selectedindx) {
		this.selectedindx = selectedindx;
	}

	public void setEkitaldiak(ArrayList<Ekitaldi> ekitaldiak) {
		this.ekitaldiak = ekitaldiak;
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
	public int getAgkode() {
		return agkode;
	}
	public void setAgkode(int agkode) {
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
	
	public int getIraupena() {
		return iraupena;
	}
	

	public void setIraupena(int iraupena) {
		this.iraupena = iraupena;
	}

	@Override
	public String toString() {
		return "Bidaia [kode=" + kode + ", izena=" + izena + ", agkode=" + agkode + ", desk=" + desk + ", bidmota="
				+ bidmota + ", hdata=" + hasidata + ", adata=" + amaidata + ", iraupena=" + iraupena + ", helmugakode="
				+ herrihelmuga + "]";
	}
	
	
	
	
}
