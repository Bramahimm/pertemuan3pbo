import java.util.*;

public class list {
    public static void main(String[] args) {
        // ArrayList = berbasis array dinamis
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Buku A");
        arrayList.add("Buku B");
        arrayList.add("Buku C");
        arrayList.add("Buku A"); // duplikat diperbolehkan
        System.out.println("ArrayList (akses cepat via index): " + arrayList);
        System.out.println("Ambil elemen indeks ke-2: " + arrayList.get(2)+"\n");

        // LinkedList = berbasis rantai node
        List<String> linkedList = new LinkedList<>();
        linkedList.add("rantai 1");
        linkedList.add("rantai 2");
        linkedList.add("rantai 3");
        linkedList.add(1, "rantai node sisipan"); // sisip di tengah
        System.out.println("LinkedList (mudah disisipkan/hapus): " + linkedList+"\n");

        // Vector = mirip ArrayList tetapi thread-safe (gak akan saling timpa)
        Vector<String> vector = new Vector<>();
        vector.add("Data 1");
        vector.add("Data 2");
        vector.add("Data 3");
        System.out.println("Vector: " + vector+"\n");

        // Stack = anak dari Vector, aturan LIFO
        Stack<String> stack = new Stack<>();
        stack.push("Piring 1");
        stack.push("Piring 2");
        stack.push("Piring 3");
        System.out.println("Stack (sebelum pop): " + stack);
        System.out.println("Ambil (pop) elemen teratas: " + stack.pop());
        System.out.println("Stack (sesudah pop): " + stack);
    }
}