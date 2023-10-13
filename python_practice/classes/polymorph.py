print(10+20)
print("Python" + "Programming")

print([1, 2, 3]+[4, 5, 6])
print("Python" * 3)

# MAGIC METHODS (they are used to change the default working of operators)
# ADDITION


class Book:
    def __init__(self, pages, title):
        self.pages = pages
        self.title = title

    def __add__(self, others):
        return self.pages + others.pages


b1 = Book(100, 'Secrets life')
b2 = Book(350, 'Ajanaku')
print(b1 + b2)
print(b1.pages,  b1.title)


# METHOD OVERLOADING
class Demo:
    def __init__(self, a=None, b=None, c=None):
        if a != None and b != None and c != None:
            pass

# CONSTRUCTOR OVERLOADING


# METHOD OVERRIDING
# The same method but different implementation. A class can inherit from a parent class but would change the way a particular
# method is implemented

class P:
    def properties_status(self):
        print("Money, LAnd, Gold")

    def to_marry(self):
        print("Alaba")


class Q(P):
    def study_status(self):
        print("Studies done, waiting for job")

    def to_marry(self):
        print("Johnson")


q = Q()
p = P()

q.to_marry()
p.to_marry()


# CONSTRUCTOR OVERRIDING

class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age


class Employee(Person):
    def __init__(self, name, age, enum, esal):
        self.enum = enum
        self.esal = esal
        super().__init__(name, age)

# STRING METHOD
    def __str__(self):
        return f"This is the employee name, age, number and salary, {self.name}, {self.age}, {self.enum} {self.esal} "

    def display(self):
        print("Employee name", self.name)
        print("Employee age", self.age)
        print("Employee number", self.enum)
        print("Employee salary", self.esal)


aa = Employee('Josh', 44, 1144, 300000)
bb = Employee("Kun", 22, 1112, 600000)
print(aa)
print(bb)
# aa.display()
# bb.display()
