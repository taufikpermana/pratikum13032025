package praktikumtaufik;
//Taufik permana 1A
public class Sepeda extends Kendaraan {
    protected int jmlSadel;
    protected int jmlGir;

    public Sepeda() {
        super();
    }

    public Sepeda(int jmlSadel, int jmlGir) {
        super();
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public Sepeda(int jmlRoda, String warna, int jmlSadel, int jmlGir) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }

    public void setJmlSadel(int jmlSadel) {
        this.jmlSadel = jmlSadel;
    }

    public int getJmlSadel() {
        return jmlSadel;
    }

    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }

    public int getJmlGir() {
        return jmlGir;
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Jumlah sadel          : " + this.jmlSadel);
        System.out.println("Jumlah gir            : " + this.jmlGir);
    }
}
