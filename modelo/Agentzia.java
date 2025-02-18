package modelo;

import java.util.ArrayList;

public class Agentzia {

	private int agkode;
	private String izena;
	private String erabiltzaile;
	private String pasahitz;
	private String logo;
	private String markakolore;
	private String langkop;
	private String agmota;
	private ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();
	private int selectedindx;
	
	public Agentzia() {
		this.agkode = 0;
		this.izena = "";
		this.logo = "";
		this.markakolore = "";
		this.langkop = "";
		this.agmota = "";
		this.erabiltzaile = "";
		this.pasahitz="";
	}
	
	public Agentzia( String izena, String logo, String markakolore, String langkop, String agmota, String erabiltzaile, String pasahitz) {
		this.izena = izena;
		this.logo = logo;
		this.markakolore = markakolore;
		this.langkop = langkop;
		this.agmota = agmota;
		this.erabiltzaile =erabiltzaile;
		this.pasahitz=pasahitz;
	}
	
	
	public int getSelectedindx() {
		return selectedindx;
	}

	public void setSelectedindx(int selectedindx) {
		this.selectedindx = selectedindx;
	}

	public String getErabiltzaile() {
		return erabiltzaile;
	}

	public void setErabiltzaile(String erabiltzaile) {
		this.erabiltzaile = erabiltzaile;
	}

	public String getPasahitz() {
		return pasahitz;
	}

	public void setPasahitz(String pasahitz) {
		this.pasahitz = pasahitz;
	}

		
	public void setBidaiak(ArrayList<Bidai> bidaiak) {
		this.bidaiak = bidaiak;
	}

	public ArrayList<Bidai> getBidaiak() {
		return bidaiak;
	}

	public void sartuBidaia(Bidai bidaia) {
		bidaiak.add(bidaia);
	}

	public int getKodea() {
		return agkode;
	}
	public void setKodea(int kodea) {
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
