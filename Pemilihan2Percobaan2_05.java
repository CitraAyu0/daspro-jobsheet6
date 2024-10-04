import java.util.Scanner;

public class Pemilihan2Percobaan2_05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String member;
        double diskon = 0, totalHarga, harga = 0;
        int menu;
        String jenisPembayaran;

        System.out.println("-----------------------");
        System.out.println("=====MENU KAFE JTI=====");
        System.out.println("-----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice tea)");
        System.out.println("---------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        menu = input05.nextInt();
        input05.nextLine(); 
        System.out.print("Apakah punya member y/n? = ");
        member = input05.nextLine();
        System.out.print("Masukkan jenis pembayaran (QRIS/Tunai) = ");
        jenisPembayaran = input05.nextLine();
        System.out.println("---------------------------------------");

        // Menentukan harga berdasarkan pilihan menu
        if (menu == 1) {
            harga = 14000;
            System.out.println("Harga Ricebowl = " + harga);
        } else if (menu == 2) {
            harga = 3000;
            System.out.println("Harga Ice Tea = " + harga);
        } else if (menu == 3) {
            harga = 15000;
            System.out.println("Harga Bundling = " + harga);
        } else {
            System.out.println("Masukkan pilihan menu dengan benar");
            return;
        }

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon = 10 %");
        } else if (member.equalsIgnoreCase("n")) {
        } else {
            System.out.println("Member tidak valid");
            return;
        }
        totalHarga = harga - (harga * diskon);

        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalHarga -= 1000; 
            System.out.println("Potongan harga Rp. 1.000 untuk pembayaran QRIS");
        }

        System.out.println("Total bayar = " + totalHarga);
        System.out.println("-------------------------------");
    }
}