package dambi.pojoak;

public class Mendia {
    private int id;
    private String mendia;
    private int altuera;
    private String probintzia; 
    
    public Mendia(int id, String mendia, int altuera, String probintzia) {
        this.id = id;
        this.mendia = mendia;
        this.altuera = altuera;
        this.probintzia = probintzia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMendia() {
        return mendia;
    }

    public void setMendia(String mendia) {
        this.mendia = mendia;
    }

    public int getAltuera() {
        return altuera;
    }

    public void setAltuera(int altuera) {
        this.altuera = altuera;
    }

    public String getProbintzia() {
        return probintzia;
    }

    public void setProbintzia(String probintzia) {
        this.probintzia = probintzia;
    }

    
}
