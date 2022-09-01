class time {
    public static void main(String[] args) {
        long start = System.nanoTime();
        // ---------
        // Thread.sleep(1000);
        // ---------
        long end = System.nanoTime();
        System.out.println("Time: " + (end - start) + "ns");
    }
}
