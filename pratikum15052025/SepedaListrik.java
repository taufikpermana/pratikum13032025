package praktikumtaufik;
//Taufik permana 1A
public class SepedaListrik extends Sepeda {
    protected int kecepatanMaks;
    protected int jarakTempuh;


    public SepedaListrik() {
        super();
    }

    public SepedaListrik(int kecepatanMaks, int jarakTempuh) {
        super();
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }

    public SepedaListrik(int jmlRoda, String warna, int jmlSadel, int jmlGir, int kecepatanMaks, int jarakTempuh) {
        super(jmlRoda, warna, jmlSadel, jmlGir);
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh;
    }

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setJarakTempuh(int jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public int getJarakTempuh() {
        return jarakTempuh;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Kecepatan maksimum    : " + this.kecepatanMaks + " km/jam");
        System.out.println("Jarak tempuh maksimal : " + this.jarakTempuh + " km");
    }
}
