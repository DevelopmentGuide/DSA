# 27 - Calculate execution time


```java
public static void main(String[] args) {
    long start = System.nanoTime();
    // ---------
    // Thread.sleep(1000);
    // ---------
    long end = System.nanoTime();
    System.out.println("Time: " + (end - start) + "ns");
}
```


---

[26 - Tree traversal](../26-tree-traversal/README.md) | **[Home](../README.md)**