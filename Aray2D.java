
public class Aray2D {
    public static void main(String[] args) {
        String[][] kebun = {
            {"Mawar", "Melati", "Anggrek"},
            {"Tulip", "Kamboja", "Dahlia"}
        };

        System.out.println("Tanaman di baris 1 kolom 2: " + kebun[0][1]);

        // Manipulasi Elemen Array
        kebun[1][2] = "Lavender";
        System.out.println("Setelah diubah : " + kebun[1][2]);

        System.out.println("\nTanaman di Kebun:");
        for (int i = 0; i < kebun.length; i++) {
            for (int j = 0; j < kebun[i].length; j++) {
                System.out.print(kebun[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
