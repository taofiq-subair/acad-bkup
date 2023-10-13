from tkinter import *
import time

class Window(Frame):
    def __init__(self, master=None):
        Frame.__init__(self, master)
        self.master = master

        menu = Menu(self.master)
   
        self.label = Label(text="", fg="green", bg="red", font=("Helvetica", 18))
        self.label.place(x=0, y=0)
        self.update_clock()

    def update_clock(self):
      now = time.strftime('%H,%M,%S')
      self.label.configure(text=now)
      self.after(1000, self.update_clock)
   
        
    def clickToQuit(self):
      app.quit()
      # exit()

# INIT TKINTER
root = Tk()
app = Window(root)

# SET WINDOW TITLE
root.wm_title("Clock")

root.after(1000, app.update_clock)


# SHOW WINDOW
root.mainloop()