import socket

s = socket.socket()
host  = socket.gethostname()
port =3008

s.connect((host, port)) 
s.send('Hello form client'.encode())
print(s.recv(1024).decode())

s.close()