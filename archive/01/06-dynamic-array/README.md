# 06 - Dynamic Arrays

- A **Static Array** have a **fixed size** and *cannot* *grow or shrink in size*.

- A **Dynamic Array** is a data structure that *can* *grow and shrink in size*.
  - When the array is full, it *doubles* its size.

- **Advantages**
  - **Dynamic** - can grow and shrink in siz
  - **Efficient** - insertion and deletion are O(1)
  - **Random Access** - possible


- **Disadvantages**
    - **Extra Memory** - each node requires extra memory to store the pointer
    - **Wasted Memory** - when the array is full, it doubles its size, but only uses half of the new space
    - **Slow** - when the array is full, it doubles its size, which is an expensive operation


### Materials

* [Java File](./DynamicArray.java)


---

[05 - Linked Lists](../05-linked-list/README.md) | **[Home](../README.md)** | [07 - LinkedLists vs ArrayLists](../07-vs/README.md)