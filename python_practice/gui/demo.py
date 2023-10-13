from tkinter import *


class Window(Frame):
    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.master = master

        # widget can take all window
        self.pack(fill=BOTH, expand=0)

        # create button
        exitButton = Button(self, bg='red', foreground='white', text="Exit!",
                            command=self.clickToQuit)

        # place button at (0,0)
        # exitButton.place(x=0, y=0)
        exitButton.pack(side=LEFT)

        text = Label(self, text="Gerrat der", font='Arial', padx=30)
        text.pack(side=LEFT)
        text = Label(self, text="Gerrat der", font='Arial', padx=0)
        text.pack(side=LEFT)
        text = Label(self, text="Gerrat der", font='Arial', padx=0)
        text.pack(side=LEFT)

        # text.place(x=185, y=0)

    def clickToQuit(self):
        app.quit()
        # exit()


# INIT TKINTER
root = Tk()
app = Window(root)

# SET WINDOW TITLE
root.wm_title("New Window")

root.geometry('400x400')

# SHOW WINDOW
root.mainloop()
