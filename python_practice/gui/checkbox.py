import tkinter as tk

window = tk.Tk()
window.title("Checkbox window")
window.geometry("300x300")

l = tk.Label(window, bg="white", width=30, text="empty")
l.pack()


def print_selection():
    if (var1.get() == 1) and (var2.get() == 0):
        l.config(text="I love python")
    elif (var1.get() == 0) and (var2.get() == 1):
        l.config(text="I love c++")
    elif (var1.get() == 0) and (var2.get() == 0):
        l.config(text="I do not like any")

    else:
        l.config(text="I love both")


var1 = tk.IntVar()
var2 = tk.IntVar()

c1 = tk.Checkbutton(window, text="Python", variable=var1,
                    onvalue=1, offvalue=0, command=print_selection, )
c1.pack()
c2 = tk.Checkbutton(window, text="C++", variable=var2,
                    onvalue=1, offvalue=0, command=print_selection)
c2.pack()

window.mainloop()
