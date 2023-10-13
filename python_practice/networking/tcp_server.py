import socket
s= socket.socket()
host = socket.gethostname()
print(host)
port = 3008
s.bind((host, port))  

print('Waiting for connection...')
s.listen(3)

while True:
    conn, addr = s.accept()
    print("Got connection from ", addr)
    print(conn.recv(1024).decode())
    conn.send("Server saying Hi".encode())

    conn.close()