import pyodbc

driver = 'ODBC Driver 17 for SQL Server'
server = 'ISW-VERVE-AG1\SQLEXPRESS01'
db = 'training'
tableName = f"{db}.dbo.Students"

conn = pyodbc.connect(f"DRIVER={driver}; SERVER={server}; DATABASE={db}; Trusted_Connection=yes;")



class Students:
    def __init__(self, ):
        pass

    def insert(self):
        stuFirstName = input('Enter student first name: ')
        studLastName = input('Enter student last name: ')
        stuAddress = input('Enter student address: ')
        stuCourseId = int(input('Enter student course id: '))

        cursor = conn.cursor()
        cursor.execute(f"INSERT INTO {tableName} values(?,?,?,?)",(stuFirstName, studLastName, stuAddress, stuCourseId))
        cursor.commit()
        
        conn.close()


    def selectAll(self):
        cursor = conn.cursor()
        cursor.execute(f"SELECT * FROM {tableName}")
        for row in cursor:
            for value in row:
                print(value, end=', ')
            print()
        conn.close()


    def selectById(self):
        cursor = conn.cursor()
        student_id = int(input('Enter student id: '))
        cursor.execute(f"SELECT * FROM {tableName} WHERE Student_ID = ?", student_id)
        for row in cursor:
            for value in row:
                print(value, end=', ')
            print()
        conn.close()



    def delete(self):
        cursor = conn.cursor()
        student_id = int(input('Enter student id: '))
        cursor.execute(f"DELETE * FROM {tableName} WHERE Student_ID = ?", student_id)
        conn.close()

    def update(self):
        cursor = conn.cursor()
        student_id = int(input('Enter student id: '))
        cursor.execute(f"UPDATE  FROM {tableName} WHERE Student_ID = ?", student_id)
        conn.close()

    def create(self):
        try:
            cursor = conn.cursor()
            cursor.execute(f"CREATE TABLE {db}.dbo.Employees(emp_ID int Identity(100,1), emp_Name varchar(15), emp_Salary decimal(10,2), emp_Address varchar(10))")

        except pyodbc.Error as e:
            if conn:
                conn.rollback()
                print(e)

        finally:
            if cursor:
                cursor.close()
            if conn:
                conn.close()




if __name__ == '__main__':
    c = Students()
    # c.selectAll()
    # c.selectById()
    c.create()