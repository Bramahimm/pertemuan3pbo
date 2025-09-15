public class javastr {
    public static void main(String[] args) {
        // Membuat variabel String untuk menyimpan nama depan dan belakang
        String firstname = "Nicholas";
        String lastname = "Saputra";
        System.out.println("Nama depan: " + firstname);
        System.out.println("Nama belakang: " + lastname);

        // Menggabungkan Dua Buah String
        String fullname = "Nicholas" + " " + "Saputra"; // langsung gabungkan
        String fullname2 = firstname + " " + lastname; // gabungkan variabel
        System.out.println("Fullname: " + fullname);
        System.out.println("Fullname2: " + fullname2);

        // Menggunakan method toUpperCase dan toLowerCase
        String Upper = fullname.toUpperCase(); // mengubah semua huruf menjadi kapital.
        String lower = fullname.toLowerCase(); // mengubah semua huruf menjadi huruf kecil.
        System.out.println("Uppercase: " + Upper);
        System.out.println("Lowercase: " + lower);

        // Menghitung panjang string
        int panjang = fullname.length(); // menghitung jumlah karakter (termasuk spasi) dalam string.
        System.out.println("Panjang nama lengkap: " + panjang);

        // Menggunakan method substring, ambil substring dari index 1-5 (tidak termasuk 5)
        String potongan = fullname.substring(1, 5);
        System.out.println("Substring (1,5): " + potongan);

        // Menggunakan method indexOf
        // indexOf("las") mencari posisi awal substring "las" di fullname.
        // Jika ditemukan, mengembalikan indeks posisi. Jika tidak, hasilnya -1.
        int idx = fullname.indexOf("las"); // cari substring "las"
        System.out.println("Index dari \"las\": " + idx);
    }
}