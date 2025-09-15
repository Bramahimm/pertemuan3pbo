import java.util.*;

public class queue {
    public static void main(String[] args) {
        // Queue
        Queue<String> antrian = new LinkedList<>();

        antrian.add("Caca");
        antrian.add("Marica");
        antrian.add("Hey");
        antrian.add("Heyyyy");

        System.out.println("Isi antrian: " + antrian);

        String dilayani = antrian.poll(); // poll() mengeluarkan yang paling depan
        System.out.println("Dilayani: " + dilayani);
        System.out.println("Sisa antrian: " + antrian);
        System.out.println();

        // PriorityQueue
        PriorityQueue<Integer> prioritas = new PriorityQueue<>();
        prioritas.add(70);
        prioritas.add(50);
        prioritas.add(100);

        System.out.println("Isi antrian prioritas: " + prioritas);
        int diproses = prioritas.poll(); // keluar angka TERKECIL lebih dulu
        System.out.println("Diproses: " + diproses);
        System.out.println("Sisa antrian prioritas: " + prioritas);
    }
}