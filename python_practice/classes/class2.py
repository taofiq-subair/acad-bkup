import gc
import time
import math

# Class method
# class Demo:


# @classmethod
#     def m2(self):
#         Demo.b = 22
# c = Demo()
# print(Demo.__dict__)
# c.m2()
# print(Demo.__dict__)


#  Static method
# class Demo:
#     @staticmethod
#     def m1():
#         Demo.a = 300
# Decorators just add stuff to something


# def helloDecorator(f):
#     def inner1():
#         print('Hello, this is before')
#         f()
#         print('Hello, this is after')
#     return inner1


# def func_to_be_used():
#     print('This is the real function!')


# jaja = helloDecorator(func_to_be_used)
# jaja()

# # Decorator


# def calculteTime(f):
#     def inner1(n):
#         begin = time.time()
#         f(n)
#         end = time.time()
#         print("Total time taken is : ", f.__name__, end - begin)
#     return inner1


# @calculteTime
# def factorial(n):
#     time.sleep(2)
#     print(math.factorial(n))


# factorial(40)

# GETTERS AND SETTERS


# class Customer:
#     def set_name(self, name):
#         self.name = name

#     def set_id(self, id):
#         self.id = id

#     def get_name(self):
#         return self.name

#     def get_id(self):
#         print(self)
#         return self.id


# c = Customer()
# c.set_name('Johnson')
# c.set_id(419)

# print(c.get_id())
# print(c.get_name())


class Pizza:
    radius = 40

    @classmethod
    def get_radius():
        print(Pizza.get_radius())


class A:
    class B:
        def __init__(self, x,):
            print("Outer class creation")

        def __init__(self):
            print('Inner class creation')

        def m1(self):
            print("Inner class method")


a = A()
b = a.B()
b.m1()

print(gc.isenabled())
gc.disable()
print(gc.isenabled())
gc.enable()
print(gc.isenabled())


class C(A, D):
    pass
