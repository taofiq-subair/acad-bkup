import tkinter as tk
import tkinter.messagebox as tkm
import pyodbc

driver = 'ODBC Driver 17 for SQL Server'
server = 'ISW-VERVE-AG1\SQLEXPRESS01'
db = 'Training'
tableName = f"{db}.dbo.StudentsDB"


def createTable(self):
    try:
        cursor = conn.cursor()
        cursor.execute("""
        CREATE TABLE StudentsDB(
            Student_RoleID int PRIMARY KEY,
              Student_Name varchar(100), 
              Student_Address varchar(100),
              )""")
        print('COORRRR')

    except pyodbc.Error as e:
        print('ERR')
        if conn:
            print('ERR')
            conn.rollback()
            print(e)

    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()


def insertStdData(self):
    try:
        cursor = conn.cursor()

        if roleVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter role id.')
            return

        if nameVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter student name.')
            return

        if addressVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter student address.')
            return

        cursor.execute(f"INSERT INTO {tableName} values(?,?,?)",
                       (roleVar.get(), nameVar.get(), addressVar.get()))
        cursor.commit()
        tkm.showinfo(title='Query successful',
                     message='Record entered successfully')

    except pyodbc.Error as e:
        print('ERR')
        if conn:
            print('ERR')
            conn.rollback()
            print(e)

    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()


def deleteStdData(self):
    try:
        cursor = conn.cursor()

        if roleVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter role id for deletion.')
            return

        cursor.execute(
            f"DELETE FROM {tableName} WHERE Student_RoleID = {roleInput()}")
        cursor.commit()
        tkm.showinfo(title='Query successful',
                     message='Record deleted successfully')

    except pyodbc.Error as e:
        print('ERR')
        if conn:
            print('ERR')
            conn.rollback()
            print(e)

    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()


def updateStdData(self):
    try:
        cursor = conn.cursor()

        if roleVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter role id.')
            return

        if nameVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter student name.')
            return

        if addressVar.get() == '':
            tkm.showwarning(title='Incomplete query',
                            message='Please enter student address.')
            return

        cursor.execute(
            f"UPDATE {tableName}  SET Student_Name = {nameVar.get()}, Student_Address = {addressVar.get()} WHERE Student_RoleID = {roleInput()}")
        cursor.commit()
        tkm.showinfo(title='Query successful',
                     message='Record deleted successfully')

    except pyodbc.Error as e:
        print('ERR')
        if conn:
            print('ERR')
            conn.rollback()
            print(e)

    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()


def listStdData(self):
    try:
        cursor = conn.cursor()
        cursor.execute(f"SELECT * FROM {tableName}")
        tkm.showinfo(title='Query successful',
                     message='Record list')

    except pyodbc.Error as e:
        print('ERR')
        if conn:
            print('ERR')
            conn.rollback()
            print(e)

    finally:
        if cursor:
            cursor.close()
        if conn:
            conn.close()


conn = pyodbc.connect(
    f"DRIVER={driver}; SERVER={server}; DATABASE={db}; Trusted_Connection=yes;")


roleVar = tk.IntVar()
nameVar = tk.StringVar()
addressVar = tk.StringVar()

roleLabel = tk.Label(text='Role No.:')
roleInput = tk.Entry(textvariable=roleVar)

nameLabel = tk.Label(text='Name:')
nameInput = tk.Entry(textvariable=nameVar)

addressLabel = tk.Label(text='Address:')
addressInput = tk.Entry(textvariable=addressVar)

dataBox = tk.Text()

insertButton = tk.Button(text='INSERT', command=insertStdData)
deleteButton = tk.Button(text="DELETE", command=deleteStdData)
updateButton = tk.Button(text="UPDATE", command=updateStdData)
ListButton = tk.Button(text="LIST", command=listStdData)


# if __name__ == '__main__':
#     s = StudentsDB()
