# class Employee:
#     def displayName(self):
#         print('Hello, my name is T.')


# newEmp = Employee()
# print(isinstance(newEmp, Employee))
# newEmp.displayName()


# print(Employee)

# print(type(Employee))


class Employee:
    def __init__(self, id):
        self.id = id
        print('Employee id is ', id)

    def displayId(self, id):
        print(self)
        print('Emp id ', self.id)


newEmp = Employee(419)
newEmp.id
newEmp.displayId(45)


class Student:
    def m1(self):
        self.a = 11
        self.b = 21
        self.c = 31
        print(self.a)
        print(self.b)
        print(self.c)


s = Student()

s.m1()
print(s.__dict__)
