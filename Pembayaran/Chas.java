package tugaspbotaufiktka;

import java.util.Scanner;

public class Cash extends Pembayaran implements InterfacePembayaran {

    public Cash(double totalBayar) {
        super(totalBayar);
    }
    @Override
    public void pilihMetode() {
        System.out.println("Metode Pembayaran: Cash");
    }

    @Override
    public void prosesPembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah uang yang dibayar: Rp ");
        double bayar = input.nextDouble();

        if (bayar >= totalBayar) {
            double kembalian = bayar - totalBayar;
            System.out.println("Pembayaran berhasil. Kembalian Anda: Rp " + kembalian);
        } else {
            System.out.println("Uang Anda kurang. Pembayaran gagal.");
        }
    }
}
