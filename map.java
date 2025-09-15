import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class map {
    public static void main(String[] args) {
        // HashMap = Cepat, tidak peduli urutan
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Budi", 85);
        hashMap.put("Andi", 90);
        hashMap.put("Cici", 75);
        System.out.println("HashMap (tidak urut): " + hashMap);

        // LinkedHashMap = Menyimpan urutan input
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Budi", 85);
        linkedHashMap.put("Andi", 90);
        linkedHashMap.put("Cici", 75);
        System.out.println("LinkedHashMap (urutan input): " + linkedHashMap);

        // TreeMap = Diurutkan otomatis berdasarkan kunci
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Budi", 85);
        treeMap.put("Denis", 90);
        treeMap.put("Cici", 75);
        System.out.println("TreeMap (urut kunci): " + treeMap);

        // Akses Nilai Berdasarkan Kunci/key
        int nilaiBudi = treeMap.get("Budi");
        System.out.println("Nilai Budi dari TreeMap: " + nilaiBudi);

        // Loop Melalui Map
        System.out.println("\nLooping LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
        System.out.println("\nLooping HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
        System.out.println("\nLooping TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Nama: " + entry.getKey() + ", Nilai: " + entry.getValue());
        }
    }
}