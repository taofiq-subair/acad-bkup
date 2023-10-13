from abc import ABC, abstractmethod

x = 3
print(isinstance(x, ABC))
print(isinstance(x, int))


class Vehicle(ABC):
    @abstractmethod
    def go(self):
        pass

    @abstractmethod
    def stop(self):
        pass


print(isinstance(Vehicle, ABC),  '&&&&&&&&&&&&')


class Keke(Vehicle):
    def go(self):
        print("this is from the child class.. is going")

    def stop(self):
        print("this is from the child class.. is stopped")

    def jerk(self):
        print('Child class Keke is jerking')


print(type(Vehicle))
print(type(Keke))

Vehicle.go('r')
# jj = Vehicle()
a = Keke()
a.jerk()
a.go()
a.stop()

print(type(Vehicle))
print(type(Keke))
print(type(a))

# class P1:
#     def m1(self):
#         print("Parent1 method")


# class P2:
#     def m1(self):
#         print("Parent2 method")

# # The order of arguments matter, the one first would overide the method call
# class P1(P2, P1):
#     def m3(self):
#         print("Child method")


# a = P1()
# a.m1()
# # a.m2()
# a.m3()
