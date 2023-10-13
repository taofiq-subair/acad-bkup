package dbtest;

import java.sql.*;
import java.util.*;

public class JDBCUtility {
    static final String DB_URL = "jdbc:sqlserver://;servername=ISW-VERVE-AG1;" + "instanceName=SQLEXPRESS01;" + "encrypt=false; integratedSecurity=true;";

    static final String QUERY = "SELECT * FROM REGISTRATION";

    static final List<Column> studentCols = new ArrayList<>();

    public static void main(String[] args) {

//        createDatabase("TrainingDB");
//        createTable("TrainingDB");
//        insertRecords("TrainingDB");
//        selectRegistration("TrainingDB");
//        updateRegistration("TrainingDB");
//        deleteRecord("TrainingDb");
//        selectRecordsSortByFirstName("TrainingDB");
//        selectRecordsWithFirstNameContainsZA("TrainingDB");
//        selectWithoutAndWithoutIDGreaterThanOrEqualToTwo("TrainingDB");
//        Column studentId = new Column("Integer", "ID", "StudentID");
//        Column studentCode = new Column("String", "Code", "StudentCode");
//        Column studentName = new Column("String", "Name", "StudentName");

//        Column studentId = new Column("Integer", "ID", "id");
        Column studentAge = new Column("Integer", "RealAge", "age");
        Column studentFirst = new Column("String", "FirstName", "first");
        Column studentLast = new Column("String", "LastName", "last");

//        studentCols.add(studentId);
        studentCols.add(studentAge);
        studentCols.add(studentFirst);
        studentCols.add(studentLast);

        returnRecords("TrainingDB", QUERY, studentCols);

    }

    public static void createDatabase(String databaseName) {

        // Open connection and auto-closes it

        try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement()) {
            String sqlStmt = "IF NOT EXISTS (SELECT * FROM " + "sys.databases WHERE name = " + "'" + databaseName + "') CREATE DATABASE " + databaseName + ";";
            stmt.executeUpdate(sqlStmt);
            System.out.println("Created database successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void createTable(String databaseName) {

        // Open connection and auto-closes it

        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";"); Statement stmt = conn.createStatement()) {
            String sqlStmt = "IF OBJECT_ID (N'dbo.REGISTRATION', N'U') " +
                    "IS NULL " +
                    "CREATE TABLE REGISTRATION " +
                    "(id INT not NULL IDENTITY(1,1), " +
                    " first VARCHAR(50), " +
                    " last VARCHAR(50), " +
                    " age INT, " +
                    " PRIMARY KEY (id))";
            stmt.executeUpdate(sqlStmt);
            System.out.println("Created table successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void insertRecords(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";"); Statement stmt = conn.createStatement()) {

            System.out.println("Inserting into database...");
            String sqlStmt = "INSERT INTO REGISTRATION VALUES " +
                    "('Zara', 'Ali', 18)";
            stmt.executeUpdate(sqlStmt);
            sqlStmt = "INSERT INTO REGISTRATION VALUES " +
                    "('Mahnaz', 'Fatma', 25)";
            stmt.executeUpdate(sqlStmt);
            sqlStmt = "INSERT INTO REGISTRATION VALUES " +
                    "('Zaid', 'Khan', 30)";
            stmt.executeUpdate(sqlStmt);
            sqlStmt = "INSERT INTO REGISTRATION VALUES " +
                    "('Sumit', 'Mittal', 28)";
            stmt.executeUpdate(sqlStmt);

            System.out.println("Inserted records successfully...");

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void selectRegistration(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY)) {
            System.out.println(rs);
            selectAll(rs);

        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    public static void updateRegistration(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String sqlQuery = "UPDATE REGISTRATION SET age = 22 WHERE id in (1,2)";
            stmt.executeUpdate(sqlQuery);

            ResultSet rs = stmt.executeQuery(QUERY);

            selectAll(rs);
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }


    }

    public static void deleteRecord(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String sqlQuery = "DELETE FROM REGISTRATION WHERE id = 2";

            stmt.executeUpdate(sqlQuery);

            ResultSet rs = stmt.executeQuery(QUERY);

            selectAll(rs);

            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    //  ACTIVITY

    public static void selectWithoutAndWithoutIDGreaterThanOrEqualToTwo(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String q1 = "SELECT * FROM REGISTRATION";
            ResultSet rs1 = stmt.executeQuery(q1);

            System.out.println("--------WITHOUT--------");
            selectAll(rs1);
            rs1.close();

            System.out.println("--------WITH--------");
            String q2 = "SELECT * FROM REGISTRATION WHERE id >= 2";
            ResultSet rs2 = stmt.executeQuery(q2);
            selectAll(rs2);
            rs2.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    public static void selectRecordsSortByFirstName(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String q1 = "SELECT * FROM REGISTRATION ORDER BY first";


            ResultSet rs1 = stmt.executeQuery(q1);

            selectAll(rs1);

            rs1.close();

        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    public static void selectRecordsWithFirstNameContainsZA(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String q1 = "SELECT * FROM REGISTRATION WHERE first LIKE '%Za%'";


            ResultSet rs1 = stmt.executeQuery(q1);

            selectAll(rs1);

            rs1.close();
        } catch (SQLException se) {
            se.printStackTrace();
        }

    }

    public static void dropDatabase(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String q1 = "DROP DATABASE IF EXISTS REGISTRATION ORDER BY first";

            stmt.executeUpdate(q1);

        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void dropTable(String databaseName) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName + ";");
             Statement stmt = conn.createStatement()) {

            String q1 = "DROP DATABASE IF EXISTS REGISTRATION";
            stmt.executeUpdate(q1);
        } catch (SQLException se) {
            se.printStackTrace();
        }
    }

    public static void returnRecords(String databaseName, String queryStr, List<Column> columns) {
        try (Connection conn = DriverManager.getConnection(DB_URL + "databaseName=" + databaseName);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(queryStr)) {
            while (rs.next()) {

                // retrieve by column name
                for (Column column : columns) {
                    if (column.getType().equalsIgnoreCase("Integer")) {
                        System.out.print(column.getLabel()
                                .concat(": ")
                                .concat(String.valueOf(rs.getInt(column.getName())))
                                .concat(", "));
                    } else if (column.getType().equalsIgnoreCase(("String"))) {
                        System.out.print(column.getLabel()
                                .concat(": ")
                                .concat(rs.getString(column.getName()))
                                .concat(", "));
                    }
                }
                System.out.println();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Looping through result set
    private static void selectAll(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println("ID: " + rs.getInt("id"));
            System.out.println("- Age: " + rs.getString("age"));
            System.out.println("- First: " + rs.getString("first"));
            System.out.println("- Last: " + rs.getString("last"));
            System.out.println();
        }

    }


}

