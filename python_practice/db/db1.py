import pyodbc

# for a in pyodbc.drivers():
#     print(a)

driver = 'ODBC Driver 17 for SQL Server'
server = 'ISW-VERVE-AG1\SQLEXPRESS01'
db = 'training'
tableName = f"{db}.dbo.Students"

conn = pyodbc.connect(f"DRIVER={driver}; SERVER={server}; DATABASE={db}; Trusted_Connection=yes;")

cursor = conn.cursor()
cursor.execute(f"SELECT * FROM {tableName}")

student_id = int(input('Enter student id: '))
stuFirstName = input('Enter student first name: ')
studLastName = input('Enter student last name: ')
stuAddress = input('Enter student address: ')
stuCourseId = int(input('Enter student course id: '))

cursor.execute(f"INSERT INTO {tableName} values(?,?,?,?)",(stuFirstName, studLastName, stuAddress, stuCourseId))

cursor.commit()

cursor.execute(f"SELECT * FROM {tableName}")

for a in cursor:
    for value in a:
        print(value, end=",")
    print()

conn.close()
