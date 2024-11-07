public class Jawaban  {
    public static void main(String[] args) {
        // Output 1: Pola Bintang
        System.out.println("Output 1:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println(); // Memisahkan output

        // Output 2: Pola Angka
        System.out.println("Output 2:");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
