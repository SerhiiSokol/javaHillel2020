package app.modelDAO;

import app.model.Student;
import lombok.SneakyThrows;

import java.sql.*;
import java.util.ArrayList;

public class StudentDAO {
    private static String URL;
    private static String USER;
    private static String PASS;
    private Connection Connection;

    public StudentDAO(String Url, String Username, String Password) {
        URL = Url;
        USER = Username;
        PASS = Password;
    }

    @SneakyThrows
    protected void connect() {
        if (Connection == null || Connection.isClosed()) {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        Connection = DriverManager.getConnection(URL, USER, PASS);
    }

    protected void disconnect() throws SQLException {
        if (Connection != null && !Connection.isClosed()) {
            Connection.close();
        }
    }

    @SneakyThrows
    public ArrayList<Student> select() {
        ArrayList<Student> students = new ArrayList<>();
        String sql = "select * from students";
        connect();
        Statement statement = Connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()) {
            int id = rs.getInt("Cod_student");
            String fn = rs.getString("Full_name");
            int gr = rs.getInt("group");
            String yar = rs.getString("Year_of_receipt");
            boolean isdelleted = rs.getBoolean("isdelleted");
            students.add(new Student(id, fn, gr, yar, isdelleted));
        }
        rs.close();
        statement.close();

        disconnect();
        return students;
    }

    @SneakyThrows
    public void insert(Student Student) {
        String sql = "INSERT INTO students (Full_name, `group`,Year_of_receipt) Values (?, ?,?)";
        connect();
        PreparedStatement statement = Connection.prepareStatement(sql);
        statement.setString(1, Student.getFull_name());
        statement.setInt(2, Student.getGroup());
        statement.setString(3, Student.getYear_of_receipt());
        statement.executeUpdate();
        statement.close();
        disconnect();
    }

    @SneakyThrows
    public void delete(Student student) {
        String sql = "UPDATE Students SET isdelleted = true WHERE Cod_student = ?";
        connect();
        PreparedStatement statement = Connection.prepareStatement(sql);
        statement.setInt(1, student.getCod_Student());
        statement.executeUpdate();
        statement.close();
        disconnect();
    }
}

