package praktikumtaufik;
//Taufik permana 1A
public class Mobil extends Kendaraan {
    protected String bahanBakar;
    protected int kapasitasMesin;

    public Mobil() {
        super();
    }

    public Mobil(int jmlRoda, String warna, String bahanBakar, int kapasitasMesin) {
        super(jmlRoda, warna);
        this.bahanBakar = bahanBakar;
        this.kapasitasMesin = kapasitasMesin;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setKapasitasMesin(int kapasitasMesin) {
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Bahan bakar digunakan : " + this.bahanBakar);
        System.out.println("Kapasitas mesin       : " + this.kapasitasMesin + " cc");
    }

    @Override
    public String toString() {
        return "Bahan bakar yang digunakan : " + getBahanBakar() +
               "\nKapasitas mesin kendaraan  : " + getKapasitasMesin() + " cc";
    }
}
