package exercises;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class JDBCtest {
    public static void main(String[] args) {
        Properties properties = new Properties();
        Connection connection = null;
        Statement  statement = null;
        ResultSet resultSet = null;
        try {
            properties.load(new FileInputStream("F:\\codeExercises\\src\\main\\resources\\db.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
        try{
            Class.forName(properties.getProperty("driver"));
            connection = DriverManager.getConnection(
                    properties.getProperty("url"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
            connection.setAutoCommit(false);
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from user");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " +
                        resultSet.getString(2) + " " +
                        resultSet.getString(3) + " " +
                        resultSet.getString(4) + " " +
                        resultSet.getString(5));
            }

            connection.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }



    }
}
