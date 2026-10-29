import java.util.Scanner;
public class Triangle28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai n = ");
        int n = input.nextInt();

        int i = 5;
        while (i >= n) {

            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
        input.close();
    }
}
