arr = []

# stack push operation


def push(x):
    arr.append(x)

# stack pop operation


def pop(x):
    if len(arr) > 0:
        return arr.remove(x)
    else:
        return None

# stack size operation


def size():
    return len(arr)

# stack is empty operation


def is_empty():
    return len(arr) == 0


# test code
push(1)
push(2)
push(3)
print(arr)
pop(3)
print(arr)
