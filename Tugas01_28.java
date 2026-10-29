public class Tugas01_28 {
    public static void main(String[] args) {
        char huruf = '1';

        for (int i = 1; i <= 5; i++) {
            huruf = '1';
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(huruf);
                huruf++;
            }

            System.out.println();
        }
    }
}