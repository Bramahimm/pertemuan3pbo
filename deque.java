import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        // Tambah dari depan dan belakang
        deque.addFirst("Depan 1");
        deque.addLast("Belakang 1");
        deque.addFirst("Depan 2");
        deque.addLast("Belakang 2");
        deque.addFirst("Depan 3");
        deque.addLast("Belakang 3");
        System.out.println("Isi Deque: " + deque);

        // Ambil dari depan
        String ambilDepan = deque.pollFirst();
        System.out.println("Ambil Depan: " + ambilDepan);
        // Ambil dari belakang
        String ambilBelakang = deque.pollLast();
        System.out.println("Ambil Belakang: " + ambilBelakang);

        System.out.println("Deque setelah diambil: " + deque);
    }
}