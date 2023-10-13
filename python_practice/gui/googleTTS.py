from gtts import gTTS as gtts

import os

mytext = 'hola'

language = 'es'

myobj = gtts(text=mytext, lang=language, slow=False)

myobj.save('voice.mp3')

os.system("mediaplayer voice.mp3")
