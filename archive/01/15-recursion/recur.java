public class recur {
    public static void main(String[] args) {
        walk(5);
    }

    public static void walk(int n) {
        if (n == 0) {
            System.out.println("Done");
        } else {
            System.out.println("Step " + n);
            walk(n - 1);
        }
    }
}
