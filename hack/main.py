import tkinter as tk

from tkinter import *

from translate import Translator

import cv2

from pytesseract import pytesseract

from PIL import Image

import threading

import easyocr

Window = tk.Tk()

Window.title("Text Detection and Translator")

Window.geometry("800x500")

# Supported languages for translation

your_languages = ['en']

Languages = {'Hindi', 'German', 'English', 'French', 'Spanish', 'Japanese', 'Chinese', 'Russian', 'Italian', 'Korean',
             'Arabic', 'Igbo', 'Yoruba'}

Input_lang = StringVar()

Output_lang = StringVar()

Input_lang.set('English')

Output_lang.set('Spanish')


def resize_image(imagePath, new_width, new_height):
    img = Image.open(imagePath)

    resized_img = img.resize((new_width, new_height), Image.LANCZOS)

    return resized_img


def webcam_and_detect():

    def start_webcam():

        camera = cv2.VideoCapture(0)

        while True:

            _, image = camera.read()

            cv2.imshow("Text Detection", image)

            if cv2.waitKey(1) & 0xFF == ord('c'):
                cv2.imwrite('spanishimg.jpg', image)

                detected_text = ocr('spanishimg.jpg')

                TextVar.set(detected_text)

                break

        camera.release()

        cv2.destroyAllWindows()

        resized_img1 = resize_image('spanishimg.jpg', 600, 400)

        # Perform text detection using Tesseract on the resized image

        ocr(resized_img1)

        # Perform text detection using Tesseract

    # Create a new thread to run the webcam capture in the background

    webcam_thread = threading.Thread(target=start_webcam)

    webcam_thread.start()


def ocr(image):
    # image_path = 'spanishimg.jpg'

    reader = easyocr.Reader(your_languages)  # Specify the languages you want to support

    result = reader.readtext(image)

    detected_text = ""

    for detection in result:
        detected_text += detection[1] + " "  # Concatenate the detected text

    return detected_text


# Function to handle translation

def translate_text():
    translator = Translator(from_lang=Input_lang.get(), to_lang=Output_lang.get())

    Translation = translator.translate(TextVar.get())

    print(Translation)

    TranslatedTextBox.delete('1.0', tk.END)  # Clear existing text

    TranslatedTextBox.insert(tk.END, Translation)


# Create the widgets for the GUI

top_message = tk.Label(Window, text="Click the 'Start Webcam' button to capture video from the webcam",
                       font=("Arial", 14), padx=10, pady=10)

top_message.grid(row=0, column=0, columnspan=4)

# Create the "Start Webcam" button

start_button = Button(Window, text="Start Webcam", command=webcam_and_detect, bg="#4CAF50", fg="white",
                      font=("Arial", 12, "bold"), relief=tk.RAISED, padx=20, pady=10)

start_button.grid(row=1, column=0, columnspan=4)

# Create the widgets for the GUI

Label(Window, text="Choose a Language:", font=("Arial", 12)).grid(row=2, column=0, padx=10, pady=10)

InputLanguageChoiceMenu = OptionMenu(Window, Input_lang, *Languages)

InputLanguageChoiceMenu.grid(row=2, column=1, padx=10, pady=10)

Label(Window, text="Translated Language:", font=("Arial", 12)).grid(row=2, column=2, padx=10, pady=10)

NewLanguageChoiceMenu = OptionMenu(Window, Output_lang, *Languages)

NewLanguageChoiceMenu.grid(row=2, column=3, padx=10, pady=10)

Label(Window, text="Detected Text:", font=("Arial", 12)).grid(row=3, column=0, padx=10, pady=10)

TextVar = StringVar()

TextBox = Entry(Window, textvariable=TextVar, font=("Arial", 12))

TextBox.grid(row=3, column=1, columnspan=3, padx=10, pady=10)

translate_button = Button(Window, text="Translate", command=translate_text, bg="#4CAF50", fg="white",
                          font=("Arial", 12, "bold"), relief=tk.RAISED, padx=20, pady=10)

translate_button.grid(row=4, column=1, columnspan=3)

Label(Window, text="Translated Text:", font=("Arial", 12)).grid(row=5, column=0, columnspan=4, padx=10, pady=10)

OutputVar = StringVar()

TranslatedTextBox = Text(Window, font=("Arial", 12), wrap=tk.WORD, height=6)

TranslatedTextBox.grid(row=6, column=0, columnspan=4, padx=10, pady=10)

# Add a vertical scrollbar for the Translated Text box

scrollbar = Scrollbar(Window, command=TranslatedTextBox.yview)

scrollbar.grid(row=6, column=4, sticky='ns')

TranslatedTextBox.config(yscrollcommand=scrollbar.set)

# Run the main event loop
Window.mainloop()


# Press the green button in the gutter to run the script.

# if __name__ == '__main__':
#     pass


