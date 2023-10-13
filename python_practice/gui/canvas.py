import tkinter as tk

root = tk.Tk()
myCanvas = tk.Canvas(root, bg="white", height=300, width=300)

coords = 0, 0, 300, 300
arc = myCanvas.create_arc(coords, start=0,  extent=150, fill="red")
arc2 = myCanvas.create_arc(coords, start=180,  extent=215, fill="green")
myCanvas.create_line(10, 10, 100, 100, fill="purple", arrow="both")

myCanvas.pack()
root.mainloop()
