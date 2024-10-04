import java.util.Scanner;

public class MerkSepatu05 {
    public static void main(String[] args) {

        Scanner input05 = new Scanner(System.in);

        String merek, kategori;
        int ukuran;
        double harga = 0; 

        System.out.print("Masukkan merek sepatu (Converse/Skecher/Nike): ");
        merek = input05.nextLine();

        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        kategori = input05.nextLine();

        System.out.print("Masukkan ukuran sepatu: ");
        ukuran = input05.nextInt();

        if (merek.equalsIgnoreCase("Converse")) {
            if (kategori.equalsIgnoreCase("Slip On") && ukuran >= 36 && ukuran <= 40) {
                harga = 800000;
            } else if (kategori.equalsIgnoreCase("High Top") && ukuran >= 40 && ukuran <= 44) {
                harga = 1200000;
            } else {
                System.out.println("Kategori atau ukuran tidak valid untuk merek Converse.");
                return;
            }
        } else if (merek.equalsIgnoreCase("Skecher")) {
            if (kategori.equalsIgnoreCase("Woman") && ukuran >= 36 && ukuran <= 41) {
                harga = 1000000;
            } else if (kategori.equalsIgnoreCase("Man") && ukuran >= 41 && ukuran <= 44) {
                harga = 1800000;
            } else {
                System.out.println("Kategori atau ukuran tidak valid untuk merek Skecher.");
                return;
            }
        } else if (merek.equalsIgnoreCase("Nike")) {
            if (kategori.equalsIgnoreCase("Kids") && ukuran >= 36 && ukuran <= 40) {
                harga = 750000;
            } else if (kategori.equalsIgnoreCase("Adult") && ukuran >= 40 && ukuran <= 44) {
                harga = 1500000;
            } else {
                System.out.println("Kategori atau ukuran tidak valid untuk merek Nike.");
                return;
            }
        } else {
            System.out.println("Merek tidak valid.");
            return;
        }

        System.out.println("Harga sepatu: Rp " + harga);
    }
}
