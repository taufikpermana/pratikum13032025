package praktikumtaufik;
//Taufik permana 1A
public class Truk extends Mobil {
    protected String muatanMaks;


    public Truk() {
        super();
    }

    public Truk(String muatanMaks) {
        super();
        this.muatanMaks = muatanMaks;
    }

    public Truk(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, String muatanMaks) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.muatanMaks = muatanMaks;
    }

    public void setMuatanMaks(String muatanMaks) {
        this.muatanMaks = muatanMaks;
    }

    public String getMuatanMaks() {
        return muatanMaks;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Muatan maksimal truk   : " + this.muatanMaks);
    }
}
