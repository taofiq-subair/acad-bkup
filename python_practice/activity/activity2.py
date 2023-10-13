## Concatenate two lists index-wise

list1 = ['M', 'na', 'i', 'Ke']
list2 = ['y', 'me', 's', 'lly']

def concatListIndex(lst1, lst2):
    c = lst1.copy()
    for i in range(0, len(lst1)):
        c[i] += lst2[i]
    return c

print(concatListIndex(list1, list2))


## Remove all occurences of a specific item from a list

l1 = [5,20,15,20,25,50,20]

def remOccur(lst, val):
    for i in lst:
        if i == val:
            lst.remove(i)
    return lst

print(remOccur(l1,20))

## Create a string made of the middle three characters

str1 = 'JohnDipPete'

def getMidChars(s):
    mid =int(len(str1)/2)

    s2 = s[mid-1 : mid + 2]
    return s2

print(getMidChars('JaSonAy'))


## Program to create a recursive function to calculate the sum from 0 - 10

def sumOfNums(a,b):
    res = 0
    fNum = a
    sNum = b
    while sNum >= 0:
        res += sNum
        sNum -= 1
        sumOfNums(fNum,sNum)
    return res

print(sumOfNums(2,5))


## Find the largest item from a list using list comprehension

def findLargest(lst):
    maxNum = lst[0]
    y = [maxNum := i for i in lst if i > maxNum]
    return maxNum

print(findLargest([4,6,8,24,12,2]))
