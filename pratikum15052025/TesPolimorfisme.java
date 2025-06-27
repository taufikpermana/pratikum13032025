package praktikumtaufik;
//Taufik permana 1A
import java.util.Scanner;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kendaraan kendaraan = new Kendaraan(); 
        int pilihan;

        do {
            System.out.println("\n--- MENU KENDARAAN ---");
            System.out.println("1. Mobil");
            System.out.println("2. Taksi");
            System.out.println("3. Truk");
            System.out.println("4. Sepeda");
            System.out.println("5. Sepeda Listrik");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 0) {
                System.out.println("Program selesai, terima kasih!");
                break;
            }

            switch (pilihan) {
                case 1:
                    kendaraan = new Mobil();
                    System.out.print("Jumlah roda: ");
                    kendaraan.jmlRoda = input.nextInt();
                    input.nextLine();
                    System.out.print("Warna: ");
                    kendaraan.warna = input.nextLine();

                    Mobil mobil = (Mobil) kendaraan;
                    System.out.print("Bahan bakar: ");
                    mobil.bahanBakar = input.nextLine();
                    System.out.print("Kapasitas mesin: ");
                    mobil.kapasitasMesin = input.nextInt();
                    input.nextLine();

                    break;

                case 2:
                    Taksi taksi = new Taksi();
                    System.out.print("Jumlah roda: ");
                    taksi.jmlRoda = input.nextInt();
                    input.nextLine();
                    System.out.print("Warna: ");
                    taksi.warna = input.nextLine();
                    System.out.print("Bahan bakar: ");
                    taksi.bahanBakar = input.nextLine();
                    System.out.print("Kapasitas mesin: ");
                    taksi.kapasitasMesin = input.nextInt();
                    System.out.print("Tarif awal: ");
                    taksi.tarifAwal = input.nextInt();
                    System.out.print("Tarif per km: ");
                    taksi.tarifPerKm = input.nextInt();
                    input.nextLine();
                    kendaraan = taksi;
                    break;

                case 3:
                    Truk truk = new Truk();
                    System.out.print("Jumlah roda: ");
                    truk.jmlRoda = input.nextInt();
                    input.nextLine();
                    System.out.print("Warna: ");
                    truk.warna = input.nextLine();
                    System.out.print("Bahan bakar: ");
                    truk.bahanBakar = input.nextLine();
                    System.out.print("Kapasitas mesin: ");
                    truk.kapasitasMesin = input.nextInt();
                    input.nextLine();
                    System.out.print("Muatan maksimal: ");
                    truk.muatanMaks = input.nextLine();
                    kendaraan = truk;
                    break;

                case 4:
                    Sepeda sepeda = new Sepeda();
                    System.out.print("Jumlah roda: ");
                    sepeda.jmlRoda = input.nextInt();
                    input.nextLine();
                    System.out.print("Warna: ");
                    sepeda.warna = input.nextLine();
                    System.out.print("Jumlah sadel: ");
                    sepeda.jmlSadel = input.nextInt();
                    System.out.print("Jumlah gir: ");
                    sepeda.jmlGir = input.nextInt();
                    input.nextLine();
                    kendaraan = sepeda;
                    break;

                case 5:
                    SepedaListrik spdListrik = new SepedaListrik();
                    System.out.print("Jumlah roda: ");
                    spdListrik.jmlRoda = input.nextInt();
                    input.nextLine();
                    System.out.print("Warna: ");
                    spdListrik.warna = input.nextLine();
                    System.out.print("Jumlah sadel: ");
                    spdListrik.jmlSadel = input.nextInt();
                    System.out.print("Jumlah gir: ");
                    spdListrik.jmlGir = input.nextInt();
                    System.out.print("Kecepatan maks: ");
                    spdListrik.kecepatanMaks = input.nextInt();
                    System.out.print("Jarak tempuh: ");
                    spdListrik.jarakTempuh = input.nextInt();
                    input.nextLine();
                    kendaraan = spdListrik;
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi!");
                    
            }

            System.out.println("\n--- Data Kendaraan ---");
            kendaraan.cetak();

        } while (true);

        input.close();
    }
}
