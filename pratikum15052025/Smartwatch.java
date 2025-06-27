package utspbotaufikpermana;

public class Smartwatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;

    public Smartwatch() {
        super();
    }

    public Smartwatch(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera,
                      int ukuranLayar, boolean tahanAir) {
        super(merek, tahunProduksi, garansi, kapasitasBaterai, jumlahKamera);
        this.ukuranLayar = ukuranLayar;
        this.tahanAir = tahanAir;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public boolean isTahanAir() {
        return tahanAir;
    }

    public void setTahanAir(boolean tahanAir) {
        this.tahanAir = tahanAir;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nUkuran Layar: " + ukuranLayar + " inci" +
                "\nTahan Air: " + (tahanAir ? "Ya" : "Tidak");
    }
}
