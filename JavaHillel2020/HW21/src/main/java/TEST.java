import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TEST {
    private static final String URL = "jdbc:mysql://jdbc:mysql://127.0.0.1:3306";
    private static final String USER = "root";
    private static final String PASS = "Sokolov91";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC&"
                        + "useSSL=false&user=root&password=S@mposebe1");
 Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from students");
System.out.println(rs.getMetaData().getTableName(1));

        int columnCount = rs.getMetaData().getColumnCount();
        for (int i = 1; i <= columnCount; i++) {
            System.out.print(rs.getMetaData().getColumnName(i) + " ");
            System.out.print(rs.getMetaData().getColumnDisplaySize(i) + " ");
            System.out.println(rs.getMetaData().getColumnTypeName(i));
}
        List<Student> students = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("Cod_student");
            String fn = rs.getString("Full_name");
            int gr = rs.getInt("group");
            String yar = rs.getString("Year_of_receipt");

           students.add(new Student(id,fn, gr, yar));
  }

        System.out.println(students.size());
        for (int i =0;i<students.size();i++) {
            System.out.println(students.get(i));
        }
//        PreparedStatement preparedStatement = connection.prepareStatement("insert into city(city) values (?)");
//        List<String> cities = List.of("Berlin", "London", "Paris", "Madrid");
//        for (String city : cities) {
//            preparedStatement.setString(1, city);
//            preparedStatement.executeUpdate();
//        }

connection.close();
}
}
