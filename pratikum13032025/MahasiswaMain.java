/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum13032025;
import java.util.Scanner;

/**
 *
 * @author ACER NITRO
 */
public class MahasiswaMain {
    public static void main (String[]args){
        long nimM;
        String namaM;
        int tugasM;
        int quizM;
        int utsM;
        int uasM;
        
        Scanner in=new Scanner(System.in);
        ///meminta input
        System.out.print("Masukkan NIM = ");
        nimM = in.nextLong();
        in.nextLine();
        
        System.out.print("Masukkan Nama = ");
        namaM = in.nextLine();
        in.nextLine();
        
        System.out.print("Masukkan Nilai Tugas = ");
        tugasM = in.nextInt();
        
        System.out.print("Masukkan Nilai quiz = ");
        quizM = in.nextInt();
        
        System.out.print("Masukkan Nilai UTS = ");
        utsM = in.nextInt();
        
        System.out.print("Masukkan Nilai UAS = ");
        uasM = in.nextInt();
        
        ///deklarasi objek
        Mahasiswa orang = new Mahasiswa(nimM, namaM, tugasM, utsM, uasM, quizM);
        
        System.out.println("--Informasi Mahasiswa--");
        orang.TampilData();
        
        System.out.println("---Nilai Akhir---");
        orang.NilaiAkhir();
        
        System.out.println("\n---Konversi Nilai---");
        orang.KonversiNilai();
    }
    
}
