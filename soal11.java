import java.util.Scanner;

public class soal11 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

    System.out.println("Berat Paket (kg)");
    int beratpaket = scanner.nextInt();
    System.out.println("Jarak pengiriman (km)");
    int jarakpengiriman= scanner.nextInt();
    System.out.println("panjang paket (cm)");
    int panjangPaket = scanner.nextInt();
    System.out.println("lebar paket (cm)");
    int lebarPaket = scanner.nextInt();
    System.out.println("Tinggi Paket (cm)");
    int tingiPaket = scanner.nextInt();

    int volumePaket = panjangPaket*lebarPaket*tingiPaket;

    int biayaperKG;

    if (jarakpengiriman <=10) {
         biayaperKG = 4250;
    } else {
        biayaperKG = 6000;
    }

    int biayaPengiriman = beratpaket*biayaperKG;

    if (volumePaket >100 && volumePaket <200 ) {
        biayaPengiriman +=50000;
    } else if (volumePaket >200) {
        biayaPengiriman +=100000;

    }
        
    

    System.out.println("---------RINCIAN BIAYA--------------");
    System.out.println("berat paket " + beratpaket + "  KG");
    System.out.println("Jarak Pengiriman "+ jarakpengiriman +"  KM");
    System.out.println("panjang paket " + panjangPaket +"  CM");
    System.out.println("lebar paket "+lebarPaket +"  CM");
    System.out.println("Tinggi Paket "+ tingiPaket +"  CM");
    System.out.println("Volume Paket " + volumePaket + "  CM^3");
    System.out.println("Biaya per KG "+ biayaperKG  + "   KG");
    System.out.println("Biaya Pengiriman "+"Rp "+ biayaPengiriman);
    }
    }
    



