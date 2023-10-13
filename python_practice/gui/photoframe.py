from tkinter import *

root = Tk()

root.title("Frame Demo")

textLabel = Label(root, text="Pasuma The Best",
                  justify=LEFT, padx=10, background="red")
textLabel.pack(side=LEFT)

photo = PhotoImage(file="img.png")
imgLabel = Label(root, image=photo)
imgLabel.pack(side=RIGHT)

root.mainloop()
