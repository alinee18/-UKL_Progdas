import java.util.Scanner;

public class soal32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah array");
        int jumlah = scanner.nextInt();
        int[] array = new int[jumlah];

        System.out.println("Masukkan data array");
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("data ke " + (i + 1) + " = ");
            array[i] = scanner.nextInt();
        }

        System.out.print("Array: {");                    
        for (int i = 0; i < jumlah; i++) {                      //koma
            System.out.print(array[i]);
            if (i < jumlah - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        boolean duplikat = false;
        for (int i = 0; i < jumlah; i++) {                        //memeriksa
                        if (array[i] == -1) { 
                continue;
            }
            for (int j = i + 1; j < jumlah; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat: " + array[i]);
                    duplikat = true;
                    array[j] = -1;    
                                        //tidak dihitung lagi
                }
            }
        }

        if (!duplikat) {
            System.out.println("Tidak ada elemen duplikat dalam array.");
        }

        scanner.close();
}
}
