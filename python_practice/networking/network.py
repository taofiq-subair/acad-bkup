import socket

def client_program():
    host = ''
    port = 1012
    client_socket = socket.socket()
    message = input('-> ')
    while message.lower().strip() != 'bye':
       client_socket.send(message. encode())
       data = client_socket.recv(1024).decode()
       print('received from server ' + str(data))
       message = input("-> ")
    client_socket.close()

def server_program():
    host = socket.gethostname()
    port = 1012
    server_socket = socket.socket()

    server_socket.bind((host, port))
    server_socket.listen(5)
    print('Waiting for connection...')

    conn, addr = server_socket.accept()
    print('Got connection from' +  str(addr))

    while  True:
      data = conn.recv(1024).decode()
      if not data:
         break
      print("from connected user: "+ str(data))
      data = input("-> ")
      conn.send(data.encode())
    conn.close()

if __name__ == '__main__':
  #  server_program()
   client_program()
