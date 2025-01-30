package modelo;

public class Aireportu {

    private int aireportukod;
    private String hiria;
    
    
    public Aireportu() {
        this.aireportukod = 0;
        this.hiria = "";
    }
    
    public Aireportu(int aireportu_kod, String hiria) {
        this.aireportukod = aireportu_kod;
        this.hiria = hiria;
    }
    public int getAireportu_kod() {
        return aireportukod;
    }
    public void setAireportu_kod(int aireportu_kod) {
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