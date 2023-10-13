from tkinter import *


def say_hi():
    print('Hello! ')


root = Tk()

frame1 = Frame(root)
frame2 = Frame(root)

root.title("Frame Demo")

label = Label(frame1, text="Label", justify=LEFT,
              width=10, height=10, background="red")
label.pack(side=RIGHT)

hi_there = Button(frame1, text="Say Hi", command=say_hi)
hi_there.pack()
root.geometry("500x500")
frame1.pack(padx=1, pady=4)
frame2.pack(padx=10, pady=14)

root.mainloop()
