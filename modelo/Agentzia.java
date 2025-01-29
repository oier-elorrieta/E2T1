package modelo;

import java.util.ArrayList;

public class Agentzia {

	private String agkode;
	private String izena;
	private String erabiltzaile;
	private String pasahitz;
	private String logo;
	private String markakolore;
	private String langkop;
	private String agmota;
	private ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();
	
	
	public Agentzia() {
		this.agkode = "";
		this.izena = "";
		this.logo = "";
		this.markakolore = "";
		this.langkop = "";
		this.agmota = "";
	}
	
	public Agentzia(String kodea, String izena, String logo, String markakolore, String langkop, String agmota) {
		this.agkode = kodea;
		this.izena = izena;
		this.logo = logo;
		this.markakolore = markakolore;
		this.langkop = langkop;
		this.agmota = agmota;
	}
	
	public boolean login(String erabiltzaile, String pasahitz) {
		boolean error;
		if (erabiltzaile == this.erabiltzaile && pasahitz == this.pasahitz) {
			error = false;
		}else {
			error = true;
		}
		return error;
	}
	
	
	
	
	public String getPasahitz() {
		return pasahitz;
	}

	public void setPasahitz(String pasahitz) {
		this.pasahitz = pasahitz;
	}

	public ArrayList<Bidai> getBidaiak() {
		return bidaiak;
	}

	public void sartuBidaia(Bidai bidaiberria) {
		bidaiak.add(bidaiberria);
	}

	public String getKodea() {
		return agkode;
	}
	public void setKodea(String kodea) {
		this.agkode = kodea;
	}
	public String getIzena() {
		return izena;
	}
	public void setIzena(String izena) {
		this.izena = izena;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getMarkakolore() {
		return markakolore;
	}
	public void setMarkakolore(String markakolore) {
		this.markakolore = markakolore;
	}
	public String getLangkop() {
		return langkop;
	}
	public void setLangkop(String langkop) {
		this.langkop = langkop;
	}
	public String getAgmota() {
		return agmota;
	}
	public void setAgmota(String agmota) {
		this.agmota = agmota;
	}
	
	@Override
	public String toString() {
		return "Agentzia [kodea=" + agkode + ", izena=" + izena + ", logo=" + logo + ", markakolore=" + markakolore
				+ ", langkop=" + langkop + ", agmota=" + agmota + "]";
	}
	
	
	
	
}
