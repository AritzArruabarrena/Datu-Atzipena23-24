package dambi.atzipenekoak;

public class Xmla {
    private String strFileIn;
    private String strFileOut;

    public void Xmla(String fileIn){
        this.strFileIn = fileIn;
    }

    public void Xmla(String fileIn, String fileOut) {
        this.strFileIn = fileIn;
        this.strFileOut = fileOut;
    }
}
