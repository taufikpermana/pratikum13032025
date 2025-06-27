package tugaspbotaufiktka;

import java.util.Scanner;

public class MainPembayaran {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalBayar = 0;
        int menuPilihan, metodePilihan;

        do {
            System.out.println("\n===== MENU UTAMA =====");
            System.out.println("1. Pembayaran");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");
            menuPilihan = input.nextInt();
            input.nextLine();

            switch (menuPilihan) {
                case 1:
                    System.out.print("\nMasukkan total pembayaran: Rp ");
                    totalBayar = input.nextDouble();
                    input.nextLine();

                    do {
                        System.out.println("\nPilih metode pembayaran:");
                        System.out.println("1. Transfer");
                        System.out.println("2. Cash");
                        System.out.println("3. E-Wallet");
                        System.out.println("4. Kartu Kredit");
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.print("Pilihan: ");
                        metodePilihan = input.nextInt();
                        input.nextLine();

                        Pembayaran pembayaran = null;

                        switch (metodePilihan) {
                            case 1:
                                System.out.print("Masukkan nama bank: ");
                                String bank = input.nextLine();
                                pembayaran = new Transfer(totalBayar, bank);
                                break;
                            case 2:
                                pembayaran = new Cash(totalBayar);
                                break;
                            case 3:
                                System.out.print("Masukkan nama E-Wallet: ");
                                String ewallet = input.nextLine();
                                pembayaran = new Ewallet(totalBayar, ewallet);
                                break;
                            case 4:
                                System.out.print("Masukkan nama pemilik kartu: ");
                                String pemilik = input.nextLine();
                                pembayaran = new KartuKredit(totalBayar, pemilik);
                                break;
                            case 5:
                                System.out.println("Kembali ke menu utama...");
                                break;
                            default:
                                System.out.println("Pilihan tidak tersedia.");
                        }

                        if (pembayaran != null) {
                            pembayaran.prosesPembayaran();
                        }

                    } while (metodePilihan != 5);
                    break;

                case 2:
                    System.out.println("Keluar dari program...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (menuPilihan != 2);

        System.out.println("\nTerima kasih sudah menggunakan layanan pembayaran!");
    }
}
