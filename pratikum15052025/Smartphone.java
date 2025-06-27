package utspbopackage utspbotaufikpermana;;

public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;

    public Smartphone() {
        super();
    }

    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai = kapasitasBaterai;
        this.jumlahKamera = jumlahKamera;
    }

    public int getKapasitasBaterai() {
        return kapasitasBaterai;
    }

    public void setKapasitasBaterai(int kapasitasBaterai) {
        this.kapasitasBaterai = kapasitasBaterai;
    }

    public int getJumlahKamera() {
        return jumlahKamera;
    }

    public void setJumlahKamera(int jumlahKamera) {
        this.jumlahKamera = jumlahKamera;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKapasitas Baterai: " + kapasitasBaterai + " mAh" +
                "\nJumlah Kamera: " + jumlahKamera;
    }
}
