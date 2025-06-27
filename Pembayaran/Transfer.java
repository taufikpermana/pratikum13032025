package tugaspbotaufiktka;

import java.util.Scanner;

public class Transfer extends Pembayaran implements InterfacePembayaran {
    private String namaBank;
    private String nomorRekening;

    public Transfer(double totalBayar, String namaBank) {
        super(totalBayar);
        this.namaBank = namaBank;
    }

    @Override
    public void pilihMetode() {
        System.out.println("Metode Pembayaran: Transfer via " + namaBank);
    }

    @Override
    public void prosesPembayaran() {
        Scanner input = new Scanner(System.in);
        pilihMetode();

        // Minta input nomor rekening tujuan
        System.out.print("Masukkan nomor rekening tujuan: ");
        nomorRekening = input.nextLine();

        System.out.println("Proses pembayaran sebesar Rp " + totalBayar 
                           + " melalui " + namaBank 
                           + " ke rekening " + nomorRekening);
        System.out.println("Pembayaran berhasil!\n");
    }
}
