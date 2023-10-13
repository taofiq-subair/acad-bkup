from gtts import gTTS as gtts
import wikipedia as wiki
import os
import tkinter as tk
import tkinter.messagebox as tkm

window = tk.Tk()
window.geometry("400x400")

langVar = tk.StringVar()

textVar = tk.StringVar()
langVar.set(-1)
textVar.set("")


def searchCmd():
    if langVar.get() == '-1':
        tkm.showinfo(title='Incomplete query',
                     message='Please select a language.')
        return
    if textVar.get() == '':
        tkm.showinfo(title='Incomplete query',
                     message='Please enter a search keyword.')
        return
    result = wiki.summary(textVar.get(), sentences=2)
    print(result)
    obj = gtts(text=result, lang=langVar.get())
    obj.save("audio.mp3")
    os.system("audio.mp3")


l1 = tk.Label(window, text="Enter search keyword: ", width=20)
e1 = tk.Entry(window, textvariable=textVar)
b1 = tk.Button(window, text="Search", command=searchCmd)
r1 = tk.Radiobutton(window, text='English', value='en', variable=langVar)
r2 = tk.Radiobutton(window, text='Spanish', value='es', variable=langVar)
r3 = tk.Radiobutton(window, text='French', value='fr', variable=langVar)
# t1 = tk.Text(window, border=3, width=40, height=10)

l1.pack()
e1.pack()
b1.pack()
r1.pack()
r2.pack()
r3.pack()
# t1.pack()

window.mainloop()
