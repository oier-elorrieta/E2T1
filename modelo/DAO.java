package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import konexioa.BD_Konexioa;

public class DAO {

    


    	private static BD_Konexioa konn = new BD_Konexioa();
    	private static String sql;

    	public static boolean saioaKonprobatu(String erabiltzailea, String pasahitza) {
    	boolean error = true;
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT erabiltzailea, pasahitza from agentzia where erabiltzailea = '" + erabiltzailea
    	+ "' and pasahitza = '" + pasahitza + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	if (resultSet.getString(1) != null) {
    	if (resultSet.getString(1).equals(erabiltzailea) && resultSet.getString(2).equals(pasahitza)) {
    	error = false;
    	}

    	}

    	}

    	resultSet.close();
    	preparedStatement.close();

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return error;
    	}

    	public static String[] langileKopurua() {
    	String[] deskboxarray = new String[4];
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT deskribapena FROM lang_kopurua";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	deskboxarray[0] = "";
    	int i = 1;
    	while (resultSet.next()) {
    	deskboxarray[i] = resultSet.getString(1);
    	i++;
    	}

    	resultSet.close(); // Cerrar ResultSet
    	preparedStatement.close(); // Cerrar Statement

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return deskboxarray;
    	}

    	public static String[] agentziaMota() {
    	String[] deskboxarray = new String[4];
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT deskribapena FROM agentzia_motak";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	deskboxarray[0] = "";
    	int i = 1;
    	while (resultSet.next()) {
    	deskboxarray[i] = resultSet.getString(1);
    	i++;
    	}

    	resultSet.close(); // Cerrar ResultSet
    	preparedStatement.close(); // Cerrar Statement

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return deskboxarray;
    	}

    	public static void agentziaberri(Agentzia ag) {
    	try {

    	konn.konexioaIreki();

    	sql = "insert into agentzia(izena, logoa , markaren_kolorea, erabiltzailea, pasahitza, agentzia_mota_kodea, langile_kopurua_kodea) values ( '"
    	+ ag.getIzena() + "' , '" + ag.getLogo() + "' , '" + ag.getMarkakolore() + "' , '"
    	+ ag.getErabiltzaile() + "' , '" + ag.getPasahitz() + "' , '" + ag.getAgmota() + "' , '"
    	+ ag.getLangkop() + "')";
    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	preparedStatement.close();

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}

    	}

    	public static String langKopAgentziBilatu(int langindex) {
    	String resultado = "";
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT kodea from lang_kopurua where kodea like '%" + langindex + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {
    	resultado = resultSet.getString(1);
    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return resultado;
    	}

    	public static String agentziaMotaBilatu(int motaindex) {
    	String resultado = "";
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT kodea from agentzia_motak where kodea like '%" + motaindex + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	resultado = resultSet.getString(1);

    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return resultado;
    	}

    	public static String koloreaHartu(Agentzia ag) {
    	String resultado = "";
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT markaren_kolorea from agentzia where erabiltzailea = '" + ag.getErabiltzaile() + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	resultado = resultSet.getString(1);

    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return resultado;
    	}

    	public static Agentzia agentziaKargatuBD(String erabiltzailea, String pasahitza) {
    	Agentzia ag = new Agentzia();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT * from agentzia where erabiltzailea = '" + erabiltzailea + "' and pasahitza = '" + pasahitza
    	+ "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	ag.setKodea(resultSet.getInt(1));
    	ag.setIzena(resultSet.getString(2));
    	ag.setLogo(resultSet.getString(3));
    	ag.setMarkakolore(resultSet.getString(4));
    	ag.setErabiltzaile(resultSet.getString(5));
    	ag.setPasahitz(resultSet.getString(6));
    	ag.setAgmota(resultSet.getString(7));
    	ag.setLangkop(resultSet.getString(8));

    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println("Error al cargar el driver JDBC: " + e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return ag;
    	}

    	public static ArrayList<Bidai> bidaiKargatuDB(Agentzia ag) {
    	Bidai bidaia = null;
    	Ekitaldi eki = null;
    	ArrayList<Bidai> bidaiak = new ArrayList<Bidai>();
    	ag.setBidaiak(bidaiak);
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT * from bidaiak where agentzia_kodea = '" + ag.getKodea() + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	ResultSet resulteki = null;

    	while (resultSet.next()) {

    	bidaia = new Bidai(resultSet.getInt(1), resultSet.getString(2), ag.getKodea(), resultSet.getString(3),
    	resultSet.getString(6), resultSet.getString(7), resultSet.getString(4), resultSet.getString(5),
    	resultSet.getString(9));
    	String sqleki = "SELECT * from ekitaldiak eki left outer join ostatua os on eki.id_ekitaldia = os.id_ostatua left outer join Jarduerak jar on eki.id_ekitaldia = jar.id_jarduera left outer join joaneko_hegaldia jo on eki.id_ekitaldia = jo.id_hegaldia left outer join joan_etorriko_hegaldia joet on eki.id_ekitaldia = joet.id_hegaldia where eki.id_bidaia = '"
    	+ resultSet.getInt(1) + "';";

    	PreparedStatement preparedStatementeki = konn.konektatuta.prepareStatement(sqleki);
    	resulteki = preparedStatementeki.executeQuery();

    	while (resulteki.next()) {

    	if (resulteki.getInt(4) >= 1) {// ostatua da?
    	eki = new Ekitaldi(resulteki.getInt(4), resulteki.getString(2), resulteki.getString(3),
    	resulteki.getString(6), resulteki.getInt(7), resulteki.getString(5),
    	resulteki.getString(8), resulteki.getString(9), resulteki.getString(10));
    	bidaia.sartuEkitaldia(eki);

    	} else if (resulteki.getInt(11) >= 1) {// jarduera da?
    	eki = new Ekitaldi(resulteki.getInt(11), resulteki.getString(2), resulteki.getString(3),
    	resulteki.getString(13), resulteki.getString(14), resulteki.getInt(15));
    	bidaia.sartuEkitaldia(eki);

    	} else if (resulteki.getInt(25) >= 1) {// joan etorrikoa da?
    	eki = new Ekitaldi(resulteki.getInt(16), resulteki.getString(2), resulteki.getString(3),
    	resulteki.getString(17), resulteki.getString(24), resulteki.getString(22),
    	resulteki.getString(23), resulteki.getString(20), resulteki.getString(19),
    	resulteki.getString(18), resulteki.getInt(21), resulteki.getInt(26),
    	resulteki.getString(30), resulteki.getString(22), resulteki.getString(23),
    	resulteki.getInt(21), resulteki.getString(29), resulteki.getString(28),
    	resulteki.getString(27));
    	bidaia.sartuEkitaldia(eki);

    	} else if (resulteki.getInt(16) >= 1) { // joanekoa da?
    	eki = new Ekitaldi(resulteki.getInt(16), resulteki.getString(2), resulteki.getString(3),
    	resulteki.getString(17), resulteki.getString(24), resulteki.getString(22),
    	resulteki.getString(23), resulteki.getString(20), resulteki.getString(19),
    	resulteki.getString(18), resulteki.getInt(21));
    	bidaia.sartuEkitaldia(eki);
    	}

    	}

    	ag.sartuBidaia(bidaia);

    	}
    	if (resulteki != null)
    	resulteki.close();
    	resultSet.close();
    	preparedStatement.close();

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return ag.getBidaiak();
    	}

    	public static void bidaiGordeDB(Agentzia ag, Bidai bidaia) {
    	try {
    	konn.konexioaIreki();

    	sql = "insert into bidaiak (izena, deskribapena, hasiera_data, amaiera_data, ez_barne_zerbitzuak, bidaia_mota_kodea, agentzia_kodea, herrialdeak_kodea) values ( '"
    	+ bidaia.getIzena() + "' , '" + bidaia.getDesk() + "' , '" + bidaia.getHasidata() + "' , '"
    	+ bidaia.getAmaidata() + "' , '" + bidaia.getZerbez() + "' , '" + bidaia.getBidmota() + "' , '"
    	+ bidaia.getAgkode() + "' , '" + bidaia.getHerrihelmuga() + "')";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}

    	}
    	

    	public static void ostatuaGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;

    	try {
    	konn.konexioaIreki();

    	sql = "insert into ekitaldiak values ( '" + eki.getEkikode() + "' , '" + eki.getIzena() + "' , '"
    	+ eki.getBidaikode() + "')";

    	preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
    	resultSet = preparedStatement.executeQuery(sql);

    	while (resultSet.next()) {
    	sql = "insert into ostatua (id_ostatua, hotelaren_izena, hiria, prezioa,sarrera_eguna, irteera_eguna, logela_mota_kodea) values ( '"
    	+ resultSet.getInt(1) + "' , '" + eki.getHotizena() + "' , '" + eki.getHiria() + "' , '"
    	+ eki.getOsprezio() + "' , '" + eki.getOssardata() + "' , '" + eki.getOsirtdata() + "' , '"
    	+ eki.getLogelamotakod() + "')";

    	}
    	preparedStatement.executeUpdate(sql);

    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	try {
    	preparedStatement.close();
    	resultSet.close();
    	konn.konexioaItxi();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	}

    	}

    	}

    	
    	public static void jardueraGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;

    	try {
    	konn.konexioaIreki();

    	sql = "insert into ekitaldiak values ( '" + eki.getEkikode() + "' , '" + eki.getIzena() + "' , '"
    	+ eki.getBidaikode() + "')";

    	preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
    	resultSet = preparedStatement.executeQuery(sql);

    	while (resultSet.next()) {
    	sql = "insert into jarduerak values ( " + resultSet.getInt(1) + " , '" + eki.getIzena() + "' , '"
    	+ eki.getJardesk() + "' , '" + eki.getJardata() + "' , " + eki.getJarprezio() + ")";

    	}
    	preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}

    	}

    	public static void joanekoaGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {
    	PreparedStatement preparedStatement = null;
    	ResultSet resultSet = null;
    	// ArrayList<Aireportu> airarray = aireportuakKargatuDB();
    	try {
    	konn.konexioaIreki();

    	sql = "insert into ekitaldiak values ( '" + eki.getEkikode() + "' , '" + eki.getIzena() + "' , '"
    	+ eki.getBidaikode() + "')";

    	preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
    	resultSet = preparedStatement.executeQuery(sql);

    	while (resultSet.next()) {
    	sql = "insert into joaneko_hegaldia values ( " + resultSet.getInt(1) + " , '" + eki.getHkode() + "' , '"
    	+ eki.getIrtdata() + "' , '" + eki.getIrtordu() + "' , '" + eki.getIraupena() + "' , '"
    	+ eki.getHprezio() + "' , '" + eki.getJatairportkod() + "' , '" + eki.getHelairportkod()
    	+ "' , " + eki.getAirelinea() + ")";

    	}
    	preparedStatement = konn.konektatuta.prepareStatement(sql);
    	preparedStatement.executeUpdate(sql);

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}

    	}
    	

    	
    	public static void joanEtorrikoaGordeDB(Agentzia ag, Bidai bidaia, Ekitaldi eki) {

    		PreparedStatement preparedStatement = null;
        	ResultSet result = null;

        	try {
        	konn.konexioaIreki();
        	String sql = "insert into ekitaldiak values ( '"+ eki.getEkikode() +"' , '" + "JoanekoHegaldia" +"' , '" + eki.getBidaikode() + "')";
        		preparedStatement = konn.konektatuta.prepareStatement(sql);
        		preparedStatement.executeUpdate(sql);
    			sql = "SELECT max(id_ekitaldia) from ekitaldiak;";
    	        result = preparedStatement.executeQuery(sql);
    	         int id = 0;
    	        while(result.next()) {
    	        	 id = result.getInt(1);
    	        	  sql = "insert into joaneko_hegaldia values ( " +id +" , '" + eki.getHkode()+"' , '" + eki.getIrtdata() + "' , '" + eki.getIrtordu() + "' , '" + eki.getIraupena()+ "' , '" + eki.getHprezio()+ "' , '" + eki.getJatairportkod()+ "' , '" + eki.getHelairportkod()+ "' , '" + eki.getAirelinea()+"')";
    	        		
    	        
    	            }
    	        preparedStatement = konn.konektatuta.prepareStatement(sql);
    	        preparedStatement.executeUpdate(sql); 
    	        
    	        sql = "insert into ekitaldiak values ( '"+ eki.getEkikode() +"' , '" +"JoanEtorrikoHegaldia" +"' , '" + eki.getBidaikode() + "')";
    	        preparedStatement = konn.konektatuta.prepareStatement(sql);
    	        preparedStatement.executeUpdate(sql);
    			
    	        sql = "insert into joan_etorriko_hegaldia values ( " + id +" , '" + eki.getHkode() +"' , '" + eki.getBirtdata() + "' , '" + eki.getBirtordu() + "' , '" + eki.getBiraupena()+ "' , '" + eki.getBairelinea()+"')";
    	        preparedStatement = konn.konektatuta.prepareStatement(sql);
    	        preparedStatement.executeUpdate(sql); 
    	        	
    	        preparedStatement.close();
    	        konn.konektatuta.close();
    	        result.close();
    	
    	    } catch (SQLException e) {
    	        System.out.println("Error en la conexión a la base de datos: " + e.getMessage());
    	    }
        	konn.konexioaItxi();
    		
    	}

    	public static ArrayList<String> bidaiaMota() {
    	ArrayList<String> bidaiaMota = new ArrayList<String>();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT deskribapena FROM bidaia_motak";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();


    	while (resultSet.next()) {
    	bidaiaMota.add(resultSet.getString(1));
    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return bidaiaMota;
    	}

    	public static String bidaiaMotaBilatu(String desk) {
    	String resultado = "";
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT kodea from bidaia_motak where deskribapena like '%" + desk + "';";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	resultado = resultSet.getString(1);

    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return resultado;
    	}

    	public static ArrayList<String> herrialdeMota() {
    	ArrayList<String> herrialdeMota = new ArrayList<String>();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT herrialdeak FROM herrialdeak";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {
    	herrialdeMota.add(resultSet.getString(1));
    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return herrialdeMota;
    	}

    	public static ArrayList<String[]> herrialdeakKargatu() {
    	ArrayList<String[]> herrialdeak = new ArrayList<String[]>();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT * from herrialdeak;";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	String[] infoherri = new String[] { resultSet.getString(1), resultSet.getString(2) };
    	herrialdeak.add(infoherri);

    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	Herrialde herri = new Herrialde();

    	herri.setHerrialdearray(herrialdeak);

    	return herrialdeak;
    	}

    	public static ArrayList<Aireportu> aireportuakKargatuDB() {
    	ArrayList<Aireportu> aireportuak = new ArrayList<Aireportu>();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT * FROM iata";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {
    	Aireportu airpt = new Aireportu(resultSet.getString(1), resultSet.getString(2));
    	aireportuak.add(airpt);
    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return aireportuak;
    	}

    	public static ArrayList<String[]> airelineakKargatuDB() {
    	ArrayList<String[]> airelineak = new ArrayList<String[]>();
    	try {
    	konn.konexioaIreki();

    	sql = "SELECT * FROM airelineak";

    	PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);

    	ResultSet resultSet = preparedStatement.executeQuery();

    	while (resultSet.next()) {

    	String[] aireinfo = new String[] { resultSet.getString(1), resultSet.getString(2) };
    	airelineak.add(aireinfo);
    	}

    	resultSet.close();
    	preparedStatement.close();
    	} catch (Exception e) {
    	System.out.println(e.getMessage());
    	} finally {
    	konn.konexioaItxi();
    	}
    	return airelineak;
    	}

    	
	public static void ezabatuBidaia(Agentzia ag) {
	
		try {
			konn.konexioaIreki();
		
			sql = "delete from bidaiak where id_bidaia = " + ag.getBidaiak().get(ag.getSelectedindx()).getKode();
			
			PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);
	
		preparedStatement.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			konn.konexioaItxi();
		}
		
		}
	
	public static void ezabatuEkitaldi(Agentzia ag) {
		
		try {
			konn.konexioaIreki();
			Bidai actualbidaia = ag.getBidaiak().get(ag.getSelectedindx());
			int actualekitaldi = actualbidaia.getSelectedindx();
			
		
			sql = "delete from ekitaldiak where id_ekitaldia = " + actualbidaia.getEkitaldiak().get(actualekitaldi).getEkikode();
			
			
			PreparedStatement preparedStatement = konn.konektatuta.prepareStatement(sql);
	
			preparedStatement.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			konn.konexioaItxi();
		}
		
		}

}