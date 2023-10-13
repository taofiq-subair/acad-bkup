import pyodbc

driver = 'ODBC Driver 17 for SQL Server'
server = 'ISW-VERVE-AG1\SQLEXPRESS01'
db = 'Training'
tableName = f"{db}.dbo.FinalYearStudents"

conn = pyodbc.connect(
    f"DRIVER={driver}; SERVER={server}; DATABASE={db}; Trusted_Connection=yes;")


class FinalYearStudents:
    def createTable(self):
        try:
            cursor = conn.cursor()
            cursor.execute("""
            CREATE TABLE FinalYearStudents(
                Student_ID int identity(100,1) PRIMARY KEY,
                 Name varchar(100), 
                 Course_Code varchar(100),
                 Mark int, 
                 Grade varchar(1), 
                 Employment_Status varchar(50)
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

    def insert(self):
        def checkGrade(mark):
            if mark >= 75 and mark <= 100:
                grade = 'A'
                empStat = 'automatic employment'
            if mark >= 65 and mark <= 74:
                grade = 'B'
                empStat = 'open to work'
            if mark >= 55 and mark <= 64:
                grade = 'C'
                empStat = 'open to work'
            if mark < 55:
                grade = 'F'
                empStat = "probation"
            return grade, empStat
        
        try:
            for a in range(1, 3):
                cursor = conn.cursor()
                print(f"Insert for student, {a}")
                name = input('Please enter the student name: ')
                courseCode = input('Please enter the student course code: ')
                mark = int(input('Please enter the student mark: (0 - 100)'))

                while mark > 100:
                    print('Error! Student mark cannot be more than 100.')
                    mark = int(input('Please enter the student mark: (0 - 100)'))

                grade, empStat = checkGrade(mark)
                
                cursor.execute(f"INSERT INTO {tableName} values(?,?,?,?,?)",(name, courseCode, mark, grade, empStat))
                cursor.commit()
                print('Successfully inserted record!')
                print()
                

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

    def displayAll(self):
        cursor = conn.cursor()
        cursor.execute(f"SELECT * FROM {tableName}")
        for row in cursor:
            for value in row:
                print(value, end=', ')
            print()
        conn.close()

    def displayInOrder(self):
        cursor  = conn.cursor()
        cursor.execute(f"SELECT * FROM {tableName} ORDER BY Employment_Status ")
        for row in cursor:
            for value in row:
                print(value, end=', ')
            print()
        conn.close()


if __name__ == '__main__':
    c = FinalYearStudents()
    # c.createTable()
    # c.insert()
    c.displayAll()
    # c.displayInOrder()