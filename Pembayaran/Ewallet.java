package tugaspbotaufiktka;

import java.util.Scanner;

public class Ewallet extends Pembayaran implements InterfacePembayaran {
    private String ewallet;

    public Ewallet(double totalBayar, String ewallet) {
        super(totalBayar);
        this.ewallet = ewallet;
    }

        @Override
    public void pilihMetode() {
        System.out.println("Metode Pembayaran: E-Wallet (" + ewallet + ")");
    }

    @Override
    public void prosesPembayaran() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan saldo E-Wallet Anda: Rp ");
        double saldo = input.nextDouble();

        if (saldo >= totalBayar) {
            double sisaSaldo = saldo - totalBayar;
            System.out.println("Pembayaran melalui " + ewallet + " berhasil. Sisa saldo Anda: Rp " + sisaSaldo);
        } else {
            System.out.println("Saldo Anda tidak cukup. Pembayaran gagal.");
        }
    }
}
