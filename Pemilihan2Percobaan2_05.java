import java.util.Scanner;
public class Pemilihan2Percobaan2_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan sudut 1: ");
        float sudut1 = sc.nextFloat();
        System.out.print("Masukkan sudut 2: ");
        float sudut2 = sc.nextFloat();
        System.out.print("Masukkan sudut 3: ");
        float sudut3 = sc.nextFloat();

        float totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku siku");
            }else 
                System.out.println("Segitiga tersebut adalah bukan segitiga siku siku");
        } else
            System.err.println("Bukan segitiga");
        }
    }

