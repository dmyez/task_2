import java.sql.*;

public class DataBaseTest {
    public static void main (String[] args) throws SQLException {
        String url = "jdbc:sqlite:V:/DMEZ/db/database.db";

        // создание базы данных и соединение

        Connection conn = DriverManager.getConnection(url);
        if (conn != null) {
            System.out.println("Connection esteblished");
        } else {
            System.exit(0);
        }

        // создание таблицы
        String createTable =
                " CREATE TABLE IF NOT EXISTS clients ( \n" +
                        " id integer PRIMARY KEY, \n" +
                        " name text MOT NULL, \n"+
                        " age integer \n)";
        Statement statement = conn.createStatement();
        statement.execute(createTable);

        // Добавление данных
         String insertValues =
                 " INSERT INTO clients (name, age) VALUES (\"Ivan\", 13)";

         String updateValue = "UPDATE clients SET name = 'Kirill', age = 26 WHERE name = 'Ivan' ";

         statement.execute(insertValues);

         //Выбрать значение из базы
        String selectValue = " SELECT * FROM clients;";
        ResultSet results = statement.executeQuery(selectValue);
        final int NAME_COLUMN = 2;
        while (results.next()) {
            System.out.println("id = " + results.getInt ("id"));
            System.out.println("name = " + results.getInt (NAME_COLUMN));
            System.out.println("age = " + results.getInt ("age"));

        }

        String name = "Svetozar";
        int age = 24;
        String prepareInsert = "INSERT INTO clients (name, age) VALUES (?, ?)";
        PreparedStatement preparedStatement = conn.prepareStatement(prepareInsert);
        preparedStatement.setString(1, name);
        preparedStatement.setInt( 2, age);
        preparedStatement.execute();

        selectValue = " SELECT * FROM clients;";
        results = statement.executeQuery(selectValue);

        while (results.next()) {
            System.out.println("id = " + results.getInt ("id"));
            System.out.println("name = " + results.getInt (NAME_COLUMN));
            System.out.println("age = " + results.getInt ("age"));


        }
    }
}
