#2.
#Code to count the number of occurrence in a string

##w = 'The quick  brown fox jumps over the lazy dog'
##        
##print(w.count('fox'))

#1.
# code to remove characters that have odd index values in a string

##string = 'PYTHON'
##for a in range(0,len(string),2 ):
##    string.replace(string[a], 'h')
##    print(string[a], end="")

#3.
# count the repeated char in the string
# thequickbrownfoxjumpsoverthelazydog

##string = 'thequickbrownfoxjumpsoverthelazydog'
##for a in string:
##    if string.count(a) > 1:
##        print(a, string.count(a))

##  accpt 1-10 and output square if each numb
       
##def squareOfNumbers(*n):
##    print(len(n))
##    for a in n:
##        if  a <= 10:
##            print( f"{a} =  {a*a}")
##
##squareOfNumbers(1,2,3,4,5,6,7,8,9,10,11,23,66,7)



def guessGame ():
    arr = [5,10,15,20,25,30,35,40,45,50]
    chances = 3
    while chances > 0:
        guess = int(input(f"Enter your guess (You have {chances} left): "))
        if guess in arr:
            print('Congratulations! You guessed correctly!')
            break
        if guess not in arr:
            print('Wrong guess, please try again.')
            chances -= 1
            continue
    if chances == 0:
        print('Out of chances! Game over')
        i = input('Do you want to retry (yes or no)')
        if i == 'yes':
            guessGame()
        if i == 'no':
            return

guessGame()     

