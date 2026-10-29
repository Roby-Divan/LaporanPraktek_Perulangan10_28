import java.util.Scanner;
public class Rectangle28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai baris: ");
        int baris = input.nextInt();
        System.out.println("Masukkan nilai kolom: ");
        int kolom = input.nextInt();
        int j, i;

        for (i = 1; i <= baris; i++) {
            for (j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
