# DECLARE ARRAY
array1 = [12, 13, 14]
print(array1)

# GET THE LENGTH OF THE LIST
print(len(array1))

# ADD NEW ELEMENT TO THE BEGINNING OF THE LIST
array1.insert(0, 11)
print(array1)

# REMOVE ELEMENT FROM THE END OF THE LIST
array1.remove(13)
print(array1)

# GET INDIVIDUAL ELEMENTS
for i in range(len(array1)):
    print(array1[i])

#
#
#
#
#

# GET SUM OF INDIVIDUAL ELEMENTS
array2 = [1000000001, 1000000002, 1000000003, 1000000004, 1000000005]
sum = 0
for i in range(len(array2)):
    sum += array2[i]
print(sum)

#
#
#
#
#

# COUNT IN STRING
string1 = 'my name is john doeY'
findNum = 'a'
array3 = []
num1 = 0
num2 = 0
for i in range(len(string1)):
    array3.append(string1[i])

for i in range(len(array3)):
    if findNum == array3[i]:
        num1 = i

for i in range(len(array3)):
    if findNum == array3[i]:
        num2 += 1
print(num2)

#
#
#
#
#

# COUNT IN STRING
