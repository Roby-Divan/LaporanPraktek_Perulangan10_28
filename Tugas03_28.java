
import java.util.Scanner;

public class Tugas03_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahToko;

        do {
            System.out.print("Masukkan jumlah toko (minimal 1): ");
            jumlahToko = input.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko tidak boleh kurang dari 1.");
            }
        } while (jumlahToko < 1);
        int totalPelangganSemua = 0;
        int totalBarangSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 1;
        int toko = 1;

        while (toko <= jumlahToko) {
            int jumlahPelanggan;
            do {
                System.out.print("Jumlah pelanggan Toko " + toko + ": ");
                jumlahPelanggan = input.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Jumlah pelanggan tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);
            int pelanggan = 1;
            int totalBarangToko = 0;
            while (pelanggan <= jumlahPelanggan) {
                int barang;
                do {
                    System.out.print("Jumlah barang pelanggan " + pelanggan + " di Toko " + toko + ": ");
                    barang = input.nextInt();
                    if (barang < 0) {
                        System.out.println("Jumlah barang tidak boleh negatif.");
                    }
                } while (barang < 0);
                totalBarangToko += barang;
                pelanggan++;
            }
            System.out.println("Total pelanggan Toko " + toko + " = " + jumlahPelanggan);
            System.out.println("Total barang Toko " + toko + " = " + totalBarangToko);
            System.out.println();
            totalPelangganSemua += jumlahPelanggan;
            totalBarangSemua += totalBarangToko;

            if (totalBarangToko > barangTerbanyak) {
                barangTerbanyak = totalBarangToko;
                tokoTerbanyak = toko;
            }
            toko++;
        }
        System.out.println("Total pelanggan seluruh toko = " + totalPelangganSemua);
        System.out.println("Total barang seluruh toko = " + totalBarangSemua);
        System.out.println("Toko dengan barang terbanyak = Toko " + tokoTerbanyak);
        System.out.println("Jumlah barang terbanyak = " + barangTerbanyak);

        input.close();
    }
}
