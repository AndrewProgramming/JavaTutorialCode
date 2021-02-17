package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCMysqlDemo {
    public static void main(String[] args) throws SQLException {

        String SQL_SELECT = "select * from Course";

        Connection conn = DriverManager.
                getConnection("jdbc:mysql://127.0.0.1:3306/jdbc_demo", "root", "my-secret-pw");
        if (conn != null) {
            System.out.println("Connected to the database!");
        } else {
            System.out.println("Failed to make connection!");
        }

        PreparedStatement preparedStatement = conn.prepareStatement(SQL_SELECT);
        ResultSet resultSet = preparedStatement.executeQuery();

        //POJO
        List<Course> courseList = new ArrayList<>();
        while (resultSet.next()) {
            String courseId = resultSet.getString("courseId");
            String subjectId = resultSet.getString("subjectId");
            String courseNumber = resultSet.getString("courseNumber");
            String title = resultSet.getString("title");
            String numOfCredits = resultSet.getString("numOfCredits");

            Course instance = new Course();
            instance.setCourseId(courseId);
            instance.setSubjectId(subjectId);
            instance.setCourseNumber(courseNumber);
            instance.setTitle(title);
            instance.setNumOfCredits(numOfCredits);

            courseList.add(instance);
        }

        System.out.println(courseList);

        conn.close();


    }

}
