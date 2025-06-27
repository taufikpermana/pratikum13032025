package tugaspbotaufiktka;

import java.util.Scanner;

public class KartuKredit extends Pembayaran implements InterfacePembayaran {
    private String namaPemilik;

    public KartuKredit(double totalBayar, String namaPemilik) {
        super(totalBayar);
        this.namaPemilik = namaPemilik;
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode Pembayaran: Kartu Kredit");
    }

    @Override
    public void prosesPembayaran() {
        Scanner input = new Scanner(System.in);
        pilihMetode();

        System.out.print("Masukkan PIN kartu kredit: ");
        String pinInput = input.nextLine();

        System.out.println("PIN yang dimasukkan: " + pinInput);
        System.out.println("Memproses pembayaran sebesar Rp " + totalBayar + " atas nama " + namaPemilik);
        System.out.println("Pembayaran berhasil!\n");
    }
}
