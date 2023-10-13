from tkinter import *

class Window(Frame):
    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.master = master

        menu = Menu(self.master)
   
        self.master.config(menu=menu)
   
        fileMenu = Menu(menu)
        fileMenu.add_command(label="Item")
        fileMenu.add_command(label="Exit", command=self.clickToQuit)

        menu.add_cascade(label="File", menu=fileMenu)

        editMenu = Menu(menu)
        editMenu.add_command(label="Undo")
        editMenu.add_command(label="Redo")
        menu.add_cascade(label="Edit", menu=editMenu)

    def clickToQuit(self):
      app.quit()
      # exit()

# INIT TKINTER
root = Tk()
app = Window(root)

# SET WINDOW TITLE
root.wm_title("New Window")


# SHOW WINDOW
root.mainloop()