
public class Aray {
    public static void main(String[] args) {
        // Deklarasi dan Inisialisasi Array 1 Dimensi
        int[] angka = {10, 20, 30, 40, 50};
        
        // Akses Elemen Array
        System.out.println("Elemen ke-3, index ke-2: " + angka[2]);
        
        // Cetak Semua Elemen
        System.out.print("Isi array: ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i] + " ");
        }
    }
}
