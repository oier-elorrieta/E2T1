package modelo;

import java.util.ArrayList;


public class Herrialde {

	private ArrayList<String[]> herrialdearray = new ArrayList<String[]>() ;
	private String[] infoherri = new String[1];
	
	
	public Herrialde() {
		// select egin db eginda dagoenean
		
	}
	

	public String[] getInfoHerri(String kodherri) {
		
		for(int i = 0; i < herrialdearray.size(); i++) {
			if(this.herrialdearray.get(i)[0].equals(kodherri)) {
			infoherri = this.herrialdearray.get(i);
			}
		}
		return infoherri;
	}




	public ArrayList<String[]> getHerrialdearray() {
		return herrialdearray;
	}

	public void setHerrialdearray(ArrayList<String[]> herrialdearray) {
		this.herrialdearray = herrialdearray;
	}
}
