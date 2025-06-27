package utspbotaufikpermana;

public class Gaming extends Laptop {
    private String kartuGrafis;
    private int refreshRate;

    public Gaming() {
        super();
    }

    public Gaming(String merek, int tahunProduksi, int garansi, int ukuranLayar, int kapasitasRAM,
                  String kartuGrafis, int refreshRate) {
        super(merek, tahunProduksi, garansi, ukuranLayar, kapasitasRAM);
        this.kartuGrafis = kartuGrafis;
        this.refreshRate = refreshRate;
    }

    public String getKartuGrafis() {
        return kartuGrafis;
    }

    public void setKartuGrafis(String kartuGrafis) {
        this.kartuGrafis = kartuGrafis;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nKartu Grafis: " + kartuGrafis +
                "\nRefresh Rate: " + refreshRate + " Hz";
    }
}
