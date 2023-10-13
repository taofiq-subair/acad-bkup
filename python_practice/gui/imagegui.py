from tkinter import *
from PIL import Image, ImageTk
from tkinter import filedialog as fd


class Window(Frame):
    def cb():
        name = fd.askopenfilename()
        return name

    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.master = master
        self.pack(fill=BOTH, expand=1)

        # b1 = Button(, text="Select your image", command=self.cb)
        # "C:\\Users\\taofiq.subair\\Desktop\\python_practice\\gui\\paso.png")

        load = Image.open(Window.cb())
        render = ImageTk.PhotoImage(load)
        img = Label(self, image=render)
        img.image = render
        img.place(x=0, y=0)


# INIT TKINTER
root = Tk()
app = Window(root)

# SET WINDOW TITLE
root.wm_title("King Paso")

root.geometry('400x400')

# SHOW WINDOW
root.mainloop()
