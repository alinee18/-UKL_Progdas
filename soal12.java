import java.util.Scanner;

public class soal12 {
    public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
        System.out.println("Masukkan Angka");
        int angka = scanner.nextInt();

        if ( angka %2 == 0) {
            System.out.println(angka + "   Adalah genap");
         } else {
             
          System.out.println(angka + "  Adalah Ganjil");
          
          
          }
    }
    
}
