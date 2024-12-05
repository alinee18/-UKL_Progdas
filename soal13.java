public class soal13 {
    public static void main(String[] args) {
        tampilkanPesan();
    }

    public static void tampilkanPesan() {
        for (int i = 50; i >= 1; i--) {
            tampilkanAngkaDanPesan(i);
        }
    }

    public static void tampilkanAngkaDanPesan(int angka) {
        System.out.print(angka + ". ");
        if (angka == 1) {
            System.out.println("saya senang");
        } else {
            tampilkanPesanBerdasarkanAngka(angka);
        }
    }

    public static void tampilkanPesanBerdasarkanAngka(int angka) {
        switch (angka % 3 ) {
            case 0:
                System.out.println("saya angkatan wikusama");
                break;
            case 1:
                System.out.println("saya anak wikusama");
                break;
            case 2:`
                System.out.println("saya anak moklet");
                break;
        }
    
}
}
