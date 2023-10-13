import tkinter as tk
import tkinter.messagebox as tkm


def buttonClick():
    tkm.showinfo("title", 'message')
    tkm.showerror("title", 'message')
    tkm.showwarning("title", 'message')


root = tk.Tk()
root.title('Message.')
root.geometry("300x300")
b1 = tk.Button(root, text='hello button', command=buttonClick)
b1.pack()
root.mainloop()
