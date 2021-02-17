package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMysqlDemo2 {
    public static void main(String[]
                                    args) throws SQLException {
        String SQL_SELECT = "select * from Course";
        String UPDATE_SQL = "UPDATE `jdbc_demo`.`Course` t SET t.`numOfCredits` = 10 WHERE t.`courseId` = 3";

        String insert_sql_1="INSERT INTO `jdbc_demo`.`Course` (`subjectId`, `courseNumber`, `title`, `numOfCredits`) VALUES ('chinese1', 2, 'chinese1', 5)";
        String insert_sql_2="INSERT INTO `jdbc_demo`.`Course` (`subjectId`, `courseNumber`, `title`, `numOfCredits`) VALUES ('chinese2', 5, 'chinese2', 5)";

        Connection conn = DriverManager.
                getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_demo", "root", "my-secret-pw");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        Statement statement = conn.createStatement();
        boolean flag = statement.execute(SQL_SELECT);
        System.out.println("flag:" + flag);

        int changedLine = statement.executeUpdate(UPDATE_SQL);
        System.out.println("changedLine:" + changedLine);

        statement.addBatch(insert_sql_1);
        statement.addBatch(insert_sql_2);

        statement.executeBatch();


    }
}
