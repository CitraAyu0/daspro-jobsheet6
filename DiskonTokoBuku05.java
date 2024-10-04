import java.util.Scanner;

public class DiskonTokoBuku05 {
    public static void main(String[] args) {
        Scanner input05 = new Scanner(System.in);

        String jenisBuku;
        int jumlahBuku;
        double diskon = 0, hargaBuku, totalBayar;

        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = input05.nextLine().toLowerCase(); 

        System.out.print("Masukkan jumlah buku yang dibeli: ");
        jumlahBuku = input05.nextInt();

        System.out.print("Masukkan harga per buku: ");
        hargaBuku = input05.nextDouble();

        if (jenisBuku.equals("kamus")) {
            diskon = 0.10;
            if (jumlahBuku > 2) {
                diskon += 0.02; 
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 0.07; 
            if (jumlahBuku > 3) {
                diskon += 0.02; 
            } else if (jumlahBuku <= 3) {
                diskon += 0.01; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 0.05; 
            }
        }

        totalBayar = jumlahBuku * hargaBuku * (1 - diskon);

        System.out.println("Total yang harus dibayar setelah diskon: Rp " + totalBayar);
    }
}

