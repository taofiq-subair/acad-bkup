##name = ('Shasha')
##print(name)
##print(type(name))
##
##
##name2 = ("Bala","John", "Sala")
##
##print(type(name2))



d = tuple(range(1,16,2))
print(d,' ', type(d))


def signUp():
    uname = input("Enter new username :")
    passwrd = input("Enter new password :")
    return uname, passwrd


def login():
    uname, passwrd = signUp()
    Euname = input("Enter username :")
    Epasswrd = input("Enter password :")
    if Euname == uname and Epasswrd == passwrd:
        print('Login successfully!')
    else:
        print("Wrong user credentils")
    
login()
