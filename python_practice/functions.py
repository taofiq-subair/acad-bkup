##def areaOfTriangle(b,h):
##    return 0.5 * b * h
##
##base = int(input('Please enter the base: '))
##height = int(input('Please enter the height: '))
##
##area = areaOfTriangle(base, height)
##print('The area of the triangle is', area)


##def sumNums(a,b):
##    return a + b
##
##res = sumNums(5,9)
##
##print(res)
##
##def s1(a,b):
##    c = a+b
##    d = a - b
##    return c,d
##
##x,y = s1(20,11)
##print('sum of a and b', x)
##print('subtraction of d from a', y)
##
##def display(x):
##    x()
##    print('This is a display function')
##
##def messages():
##    print('This is a messages function')
##
##display(messages)

#Keyword args

##def cart (item, price):
##    print(f"{item} cost is {price}")
##
##cart(price=3000, item='amala')
##cart(item='semo', price=8000)
##cart('potato', 88877)

##

##def totalCost(x, *y):
##    print(f"args are {locals().values()} ")
##    sum = 0
##    for a in y:
##        sum += a
##    print(x + sum)
##
##totalCost(3,5,6,7,8,9)

##def s2(*a):
##    arguments

##def kwargs_print(**x):
##    s = x.values()
##    for a in s:
##        print(a)
##    print(s)
##    print(x)
####    for a,b in x.items():
####        print(a, b)
##
##kwargs_print(name='tao', age=9, gender='male', city='lagos', country='nigeria')
##
##c = 1
##def m():
##    c =2
##    print(c)
##    print(globals())
##    print(globals()['c'])
##
##m()

def factorial(n):
    if n < 0:
        return
    if n == 0:
        res = 1
    if n > 0:
        res = n * factorial(n-1)
    return res

print(factorial(4))

## lambda

s2 = lambda x,y: x + y

print(s2(60,40))
