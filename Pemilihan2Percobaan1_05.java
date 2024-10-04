import java.util.Scanner;

public class Pemilihan2Percobaan1_05{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = sc.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
        } else 
            System.out.println("Bukan Tahun Kabisat");
        }
    }
}
