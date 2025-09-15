import java.util.*;

public class set {
    public static void main(String[] args) {
        // HashSet = cepat, tapi tidak menjamin urutan
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apel");
        hashSet.add("Jeruk");
        hashSet.add("Pisang");
        hashSet.add("Apel"); // duplikat, diabaikan
        System.out.println("HashSet (urutan acak, tanpa duplikat): " + hashSet);

        // LinkedHashSet = menyimpan urutan sesuai input
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apel");
        linkedHashSet.add("Jeruk");
        linkedHashSet.add("Pisang");
        linkedHashSet.add("Apel"); // duplikat, diabaikan
        System.out.println("LinkedHashSet (urutan sesuai input): " + linkedHashSet);

        // TreeSet = set terurut otomatis
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Mangga");
        treeSet.add("Anggur");
        treeSet.add("Pisang");
        treeSet.add("Anggur"); // duplikat, diabaikan
        System.out.println("TreeSet (terurut alfabet): " + treeSet);
    }
}
