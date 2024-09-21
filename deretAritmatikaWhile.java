import java.util.Scanner;

public class deretAritmatikaWhile {
    public static void main(String[] args) {

        int batasAwal, batasAkhir, beda;

        System.out.println("Selamat Datang di Pembuatan Deret Aritmatika!");

        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Batas Awal: ");
        batasAwal = s.nextInt();
        System.out.print("Masukkan Batas Akhir: ");
        batasAkhir = s.nextInt();
        System.out.print("Masukkan Jeda (Beda): ");
        beda = s.nextInt();

        int i = batasAwal;

        // Perulangan while untuk menghasilkan deret aritmatika
        System.out.println("Deret Aritmatika: ");
        while (i <= batasAkhir) {
            System.out.print(i + " ");
            i += beda;
        }
    }
}

