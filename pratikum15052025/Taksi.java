package praktikumtaufik;
//Taufik permana 1A
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi() {
        super();
    }

    public Taksi(int tarifAwal, int tarifPerKm) {
        super();
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public Taksi(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin, int tarifAwal, int tarifPerKm) {
        super(jmlRoda, warna, bahanBakar, kapasitasMesin);
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }

    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }

    public int getTarifAwal() {
        return tarifAwal;
    }

    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public int getTarifPerKm() {
        return tarifPerKm;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Tarif awal             : Rp" + this.tarifAwal);
        System.out.println("Tarif per Km           : Rp" + this.tarifPerKm);
    }
}

    @Override
    public String toString() {
        return super.toString() +
                "\nUkuran Layar: " + ukuranLayar + " inci" +
                "\nTahan Air: " + (tahanAir ? "Ya" : "Tidak");
    }
}

