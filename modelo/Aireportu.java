package modelo;

public class Aireportu {

    private String aireportukod;
    private String hiria;
    
    
    public Aireportu() {
        this.aireportukod = "";
        this.hiria = "";
    }
    
    public Aireportu(String aireportu_kod, String hiria) {
        this.aireportukod = aireportu_kod;
        this.hiria = hiria;
    }
    public String getAireportu_kod() {
        return aireportukod;
    }
    public void setAireportu_kod(String aireportu_kod) {
        this.aireportukod = aireportu_kod;
    }
    public String getHiria() {
        return hiria;
    }
    public void setHiria(String hiria) {
        this.hiria = hiria;
    }
    
    @Override
    public String toString() {
        return "Aireportu [aireportu_kod=" + aireportukod + ", hiria=" + hiria + "]";
    }
    
    
    
}