import tkinter as tk
from tkinter import filedialog as fd


def callback():
    name = fd.askopenfilename()
    print(name)


errMsg = 'Error'
tk.Button(text='Click to Open File', command=callback).pack()

tk.mainloop()
