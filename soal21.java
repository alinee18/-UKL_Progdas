import java.util.Scanner;

public class soal21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jumlah Siswa");
        int jumlahSiswa = scanner.nextInt();
        double[] nilaiSiswa = new double[jumlahSiswa];
        double totalNilai = 0;

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Masukan nilai siswa ke " + (i + 1) + "=");
            nilaiSiswa[i] = scanner.nextDouble();
            totalNilai += nilaiSiswa[i];
        }
        double rataRata = totalNilai / jumlahSiswa;
        System.out.println("------------RATA RATA NILAI SISWA------------");
        System.out.println(" = " + rataRata);
    }

}
