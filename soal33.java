import java.util.Scanner;

public class soal33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                                    

        System.out.print("Masukkan jumlah array: ");
        int jumlahArray = scanner.nextInt();
        int[] array = new int[jumlahArray];

        System.out.println("-------------------- Masukkan data array --------------------");
        for (int i = 0; i < jumlahArray; i++) {
            System.out.print("data ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < jumlahArray; i++) {        //mengecek
            int jumlah = 1;
            boolean sudahDihitung = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true;
                    break;
                }
            }

            if (!sudahDihitung) {                                                               //berapakali muncul
                for (int j = i + 1; j < jumlahArray; j++) {
                    if (array[i] == array[j]) {
                        jumlah++;
                    }
                }
                System.out.println(array[i] + " terdapat " + jumlah + "X");
            }
        }

        scanner.close();
    }
}