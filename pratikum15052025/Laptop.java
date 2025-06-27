package utspbotaufikpermana;

public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;

    public Laptop() {
        super();
    }

    public Laptop(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM) {
        super(merek, tahunProduksi, garansi);
        this.ukuranLayar = ukuranLayar;
        this.kapasitasRAM = kapasitasRAM;
    }

    public int getUkuranLayar() {
        return ukuranLayar;
    }

    public void setUkuranLayar(int ukuranLayar) {
        this.ukuranLayar = ukuranLayar;
    }

    public int getKapasitasRAM() {
        return kapasitasRAM;
    }

    public void setKapasitasRAM(int kapasitasRAM) {
        this.kapasitasRAM = kapasitasRAM;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nUkuran Layar: " + ukuranLayar + " inci" +
                "\nKapasitas RAM: " + kapasitasRAM + " GB";
    }
}
