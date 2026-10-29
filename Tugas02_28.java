
import java.util.Scanner;

public class Tugas02_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n (minimal 3): ");
        int n = input.nextInt();

        if (n < 3) {
            System.out.println("Nilai n minimal 3.");
        } else {
            int baris = 1;
            int total = 0;
            
            while (baris <= n) {
                int kolom = 1;
                while (kolom <= n) {
                    int hasil = baris * kolom;
                    System.out.printf("%5d", hasil);
                    total = total + hasil;
                    kolom++;
                }
                System.out.println();
                baris++;
            }
            System.out.println("Jumlah seluruh angka = " + total);
        }
        input.close();
    }
}
