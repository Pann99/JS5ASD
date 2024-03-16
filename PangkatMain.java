package Minggu5;
import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===========================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat();
            System.out.print("Masukkan nilai yang akan dipangkatkan ke- " + (i + 1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkatan ke- " + (i + 1) + " : ");
            png[i].pangkat = sc.nextInt();
            System.out.println(" ");
        }

        System.out.println("===========================================================");
        System.out.println("Pilih metode perhitungan pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("===========================================================");
                System.out.println("Hasil pangkat dengan Brute Force ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;

            case 2:
                System.out.println("===========================================================");
                System.out.println("Hasil pangkat dengan Divide and Conquer ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;

            case 3:
                return;

            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("===========================================================");
    }
}
