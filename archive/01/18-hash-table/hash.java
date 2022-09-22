import java.util.Hashtable;

public class hash {
    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>();

        table.put("100", "A");
        table.put("200", "B");
        table.put("300", "C");
        table.put("400", "D");
        table.put("500", "E");

        table.remove("100");

        for (String i : table.keySet()) {
            System.out.println(i.hashCode() % 10 + " " + table.get(i));
        }
    }
}
