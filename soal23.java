import java.util.Random;
import java.util.Scanner;

public class soal23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        while (true) {    //perulangan
            int bilangan1 = r.nextInt(10) ;      //acak
            int bilangan2 = r.nextInt(10) ;

            int operator = r.nextInt(3);          //mtk
            int hasil = 0;
            String operatorSimbol = "";

            if (operator == 0) {
                operatorSimbol = "x";
                hasil = bilangan1 * bilangan2;
            } else if (operator == 1) {
                operatorSimbol = "/";              
              hasil = bilangan1 / bilangan2;
            } else  {
                operatorSimbol = "%";
                hasil = bilangan1 % bilangan2;
            }

            System.out.println("Soal: " + bilangan1 + " " + operatorSimbol + " " + bilangan2 + " = ?");
            System.out.print("Jawaban Anda: ");
            int jawaban = scanner.nextInt();

            if (jawaban == hasil) {
                System.out.println("Benar!");
            } else {
                System.out.println("Salah! Jawaban yang benar adalah: " + hasil);
            }

            System.out.print("Ingin mencoba lagi? (Y/N): ");
            String lanjut = scanner.next();

            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }
    }

    System.out.println("Terima Kasih , Semangat terus yah ! :) ");
    }
}

