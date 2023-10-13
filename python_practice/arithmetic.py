from functools import reduce

##x = 10
##def sum(a,b):
##    print("Sum of two values: ", a + b)
##
##def mult(a,b):
##    print("Multiplication of two values: ", a * b)
##
##def div(a,b):
##    print(f"Division of {a} by {b}: ", a /b)
##
##def sub(a,b):
##    print(f"Subtraction of {b} from {a}: ", a - b)
##    
##
##n = print(__name__)
##p = print(__package__)
##d = print(dir())


##e = list(range(1,7))
##
##print(e[2:5:2])
##
##print(e[4::2])
##
##print(e[3:5])
##xx = list(range(1,6))+ [5] + list(range(5,2,-2))
##
##print(xx)
##
##
##s  = xx.pop(3)
##
##print(s)
##print(xx)


##l = [10, 20, 30, 40]
##
##print(l)
##
##l.insert(10,5000)
##print(l)
##l.insert(1,111)
##print(l)
####l.insert(-100,999)
####print(l)
##l.insert(0, 222)
##print(l)
##l.insert(10, 333)
##print(l)
##l.insert(-10, 444)
##print(l)
##l.insert(-9,200)
##print(l)

##s = input('enter : ')
##a = 0
##b = 0
##
##for k in s:
##    if k == '#':
##        a += 1
##    if k == '*':
##        b+=1
##    else:
##        continue
##
##print(a -b)
     

##august_txns = [100,200,500,600,400,500,900]
##sept_txns =  [111,222,333,600,790,100,200]
##
##print('August month transactions are: ', august_txns)
##
##print('September month transactions are: ', sept_txns)
##
####sept_txns.extend(august_txns)
####
####print("August and Sept total amount is: ", sum(sept_txns))
##
##sept_txns.remove(790)
##print(sept_txns)

##
##def arrSpread(arr):
##    res = []
##    for a in arr:
##        if isinstance(a, list):
##

##items_cost = [999,888,1100,1200,1300, 777]
##gr_thousand = filter(lambda x: x > 1000, items_cost)
##
##print(list(gr_thousand))
##
##
##cost = [100,200,300,400]
##mapp = map(lambda x : x + 20, cost)
##print(list(mapp))
##
##
##cc = [111,222,333,444]
##reducer = reduce(lambda x,y : x + y, cc)
##print(reducer)

x = [1,2,3,4]
y =  [i*2 for i in x]
print(y)

xx = range(1,20,3)
yy = [i for i in xx if i%2==0]
print(yy)
