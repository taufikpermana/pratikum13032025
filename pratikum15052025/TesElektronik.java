package utspbotaufikpermana;

import java.util.Scanner;

public class TestElektronik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n=== Menu Elektronik ===");
            System.out.println("1. Laptop");
            System.out.println("2. Smartphone");
            System.out.println("3. Smartwatch");
            System.out.println("4. Gaming ");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("\n=== Data Laptop ===");
                    System.out.print("Merek: ");
                    String merekLaptop = input.nextLine();
                    System.out.print("Tahun Produksi: ");
                    int tahunLaptop = input.nextInt();
                    System.out.print("Garansi (tahun): ");
                    int garansiLaptop = input.nextInt();
                    System.out.print("Ukuran Layar (inci): ");
                    int ukuranLayar = input.nextInt();
                    System.out.print("Kapasitas RAM (GB): ");
                    int ramLaptop = input.nextInt();

                    Laptop laptop = new Laptop(merekLaptop, tahunLaptop, garansiLaptop, ukuranLayar, ramLaptop);
                    System.out.println("\n" + laptop.toString());
                    break;

                case 2:
                    System.out.println("\n=== Data Smartphone ===");
                    System.out.print("Merek: ");
                    String merekHP = input.nextLine();
                    System.out.print("Tahun Produksi: ");
                    int tahunHP = input.nextInt();
                    System.out.print("Garansi (tahun): ");
                    int garansiHP = input.nextInt();
                    System.out.print("Kapasitas Baterai (mAh): ");
                    int baterai = input.nextInt();
                    System.out.print("Jumlah Kamera: ");
                    int kamera = input.nextInt();

                    Smartphone hp = new Smartphone(merekHP, tahunHP, garansiHP, baterai, kamera);
                    System.out.println("\n" + hp.toString());
                    break;

                case 3:
                    System.out.println("\n=== Data Smartwatch ===");
                    System.out.print("Merek: ");
                    String merekWatch = input.nextLine();
                    System.out.print("Tahun Produksi: ");
                    int tahunWatch = input.nextInt();
                    System.out.print("Garansi (tahun): ");
                    int garansiWatch = input.nextInt();
                    System.out.print("Kapasitas Baterai (mAh): ");
                    int bateraiWatch = input.nextInt();
                    System.out.print("Jumlah Kamera: ");
                    int kameraWatch = input.nextInt();
                    System.out.print("Ukuran Layar (inci): ");
                    int ukuranWatch = input.nextInt();
                    System.out.print("Tahan Air? (true/false): ");
                    boolean tahanAir = input.nextBoolean();

                    Smartwatch watch = new Smartwatch(merekWatch, tahunWatch, garansiWatch, bateraiWatch, kameraWatch, ukuranWatch, tahanAir);
                    System.out.println("\n" + watch.toString());
                    break;

                case 4:
                    System.out.println("\n=== Data Gaming  ===");
                    System.out.print("Merek: ");
                    String merekGaming = input.nextLine();
                    System.out.print("Tahun Produksi: ");
                    int tahunGaming = input.nextInt();
                    System.out.print("Garansi (tahun): ");
                    int garansiGaming = input.nextInt();
                    System.out.print("Ukuran Layar (inci): ");
                    int ukuranGaming = input.nextInt();
                    System.out.print("Kapasitas RAM (GB): ");
                    int ramGaming = input.nextInt();
                    input.nextLine();
                    System.out.print("Kartu Grafis: ");
                    String vga = input.nextLine();
                    System.out.print("Refresh Rate (Hz): ");
                    int refresh = input.nextInt();

                    Gaming gaming = new Gaming(merekGaming, tahunGaming, garansiGaming, ukuranGaming, ramGaming, vga, refresh);
                    System.out.println("\n" + gaming.toString());
                    break;

                case 5:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia.");
            }

        } while (pilih != 5);
    }
}
