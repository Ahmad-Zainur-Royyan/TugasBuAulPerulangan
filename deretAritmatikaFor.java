import java.util.Scanner;

public class deretAritmatikaFor {
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

        System.out.println("Deret Aritmatika: ");
        
        // Jika beda positif, gunakan for untuk deret bertambah
        if (beda > 0) {
            for (int i = batasAwal; i <= batasAkhir; i += beda) {
                System.out.print(i + " ");
            }
        }
        // Jika beda negatif, gunakan for untuk deret menurun
        else if (beda < 0) {
            for (int i = batasAwal; i >= batasAkhir; i += beda) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Beda tidak boleh 0.");
        }
    }
}
