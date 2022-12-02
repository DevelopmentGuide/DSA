# 14 - Insertion sort

- Insertion sort compareselements to the **left** of the current element, and **inserts** the current element in the correct position.

- It has an **O(n^2)** time complexity, which makes it **inefficient** on **large** lists, and generally performs worse than the similar **selection sort**.


### Visual Representation

<img src="../../../assets/images/insertionsort.png" height=250px>

### Comparison

| Algorithm                                   | Best Case  | Average Case | Worst Case | Space Complexity |
| ------------------------------------------- | ---------- | ------------ | ---------- | ---------------- |
| [Bubble Sort](../12-bubble-sort/README.md)  | O(n)       | O(n^2)       | O(n^2)     | O(1)             |
| [Selection](../13-selection-sort/README.md) | O(n^2)     | O(n^2)       | O(n^2)     | O(1)             |
| [Insertion](../14-insertion-sort/README.md) | O(n)       | O(n^2)       | O(n^2)     | O(1)             |
| [Recursion](../15-recursion/README.md)      | O(n log n) | O(n log n)   | O(n^2)     | O(n)             |
| [Merge](../16-merge-sort/README.md)         | O(n log n) | O(n log n)   | O(n log n) | O(n)             |
| [Quick](../17-quick-sort/README.md)         | O(n log n) | O(n log n)   | O(n^2)     | O(log n)         |



### Materials

* [Java File](./ins.java)


---

[13 - Selection sort](../13-selection-sort/README.md) | **[Home](../README.md)** | [15 - Recursion](../15-recursion/README.md)