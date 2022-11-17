# 10 - Binary search

- Binary search is a search algorithm that finds the position of a target value within a **sorted array**.

- It compares the **target value** to the **middle element** of the array.

- If they are **not equal**, the half in which the target cannot lie is eliminated and the search continues on the remaining half, again taking the **middle element** to compare to the target value, and **repeating this until the target value is found**

- `O(log n)` in the **best case** and `O(n)` in the **worst case**.


### Materials

* [Java File](./binsearch.java)


---

[09 - Linear search](../09-linear-search/README.md) | **[Home](../README.md)** | [11 - Interpolation search](../11-interpolation-search/README.md)