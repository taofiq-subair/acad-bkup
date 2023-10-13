"""
print('Please enter a number')

vv = int(input('Please enter a number between 0 and 4: '))
if vv == 0:
    print('You entered: ', vv)

elif vv == 1:
    print('You entered: ', vv)

elif vv == 2:
    print('You entered: ', vv)

elif vv == 3:
    print('You entered: ', vv)

elif vv == 4:
    print('You entered: ', vv)

else:
    print('Beyond the range than specified')
    """

##x = int(input('Enter first number: '))
##y = int(input('Enter second number: '))
##
##if x > y :
##    print('Higher number is: ', x)
##else:
##    print('Higher umber is: ', y)

##a ,b = 40,50
##min  = b if a < b else a
##print(min)

##x = 1
##while x<6:
##    print(x)
##    
##print('End')

##x  = [10,20,25,28,27,35,63,71,101,3]
##sum = 0
##for a in x:
##    if a % 2 == 0:
##        sum += a
##print(f"sum is of even number in the array {x} is {sum}")

##rows = range(1,21)
##for a in rows:
##    print(a, end=' ')


##for a in range(-1,99, 2):
####    print(a, end=" ")
##    print(a + 2, end=" ")
##
##group = [1,2,3,4]
##n  = int(input('Please enter a number: '))
##for a in group:
##    if a == n:
##        print('Number found!')
##        break


##cart = [10,20,40,500,700,1000]
##for a in cart:
##    if a >= 500:
##        continue
##    print('item less than 500: ', a)

##
##g = [1,2,3,4,5,6]
##inp = int(input('Enter a number: '))
##
##for a in g:
##    if a == inp:
##        print(a)
##else:
##        print('hi')
##
##h = 4
##while h<10:
##    print(h)
##    h += 1
##else:
##    print('hello there')


##tot = 0
##while True:
##    inp = int(input('Please enter a number (press 0 to exit)'))
##    if inp == 0:
##        break;
##    tot += inp
##print('total', tot)

tot = 0

while True:
    inp = int(input('Please enter a number (Enter -1 to exit): '))
    if inp == -1:
        break
    inp2 = int(input('Please enter a second number (Enter -1 to exit): '))
    if inp == -1:
        break

    if inp > inp2:
        print(inp)
        continue
    if inp2 > inp:
        print(inp2)
        continue
    
    
##print('total', tot)
