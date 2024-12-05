import java.util.Scanner;

public class soal31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa:");
        int jumlahSiswa = scanner.nextInt();
        scanner.nextLine();

        String[] namaSiswa = new String[jumlahSiswa];
        int[] nilaiSiswa = new int[jumlahSiswa];
        int totalNilai = 0;
    


        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukkan nama siswa " + (i + 1) + ":");
            namaSiswa[i] = scanner.nextLine();

            System.out.println("Masukkan nilai untuk " + namaSiswa[i] + ":");
            nilaiSiswa[i] = scanner.nextInt();
            scanner.nextLine();
       totalNilai += nilaiSiswa[i];

        }
        double rataRata = totalNilai/jumlahSiswa;
        System.out.println("\n-----------------hasil rata rata nilai siswa-----------------------");
        System.out.println("\n------------------- "      + rataRata +       "----------------------");


        System.out.println("\n------------------ Nama dan Nilai Siswa ------------------");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println(namaSiswa[i] + " = Nilai = " + nilaiSiswa[i]);
    }
    
}
}
