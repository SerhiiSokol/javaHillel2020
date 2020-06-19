package ru.javavision.modelDAO;

import ru.javavision.model.Student;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;


public class StudentDB {


    private static  final String URL = "jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC&useSSL=false";
    private static final String USER = "root";
    private static final String PASS = "S@mposebe1";

    public static ArrayList<Student> select() throws ClassNotFoundException, NoSuchMethodException, SQLException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        ResultSet rs = conn.createStatement().executeQuery("select * from students");
        ArrayList<Student> students = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("Cod_student");
            String fn = rs.getString("Full_name");
            int gr = rs.getInt("group");
            String yar = rs.getString("Year_of_receipt");
            boolean isdelleted = true;
            students.add(new Student(id, fn, gr, yar, isdelleted));
        }

        return students;

    }
    public static Student selectOne(int Cod_student) {

        Student student = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)){

                String sql = "SELECT * FROM students WHERE Cod_student=?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, Cod_student);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet.next()){

                        int Cod_Student = 0;
                        String Full_name =null;
                        int group =0;
                        String Year_of_receipt = null;
                        boolean isdelleted=true;
                         student = new Student(Cod_Student,Full_name,group,Year_of_receipt,isdelleted);
                    }
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return student;
    }
    public static int insert(Student Student) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)){

                String sql = "INSERT INTO students (Full_name, `group`,Year_of_receipt) Values (?, ?,?)";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, Student.getFull_name());
                    preparedStatement.setInt(2, Student.getGroup());
                    preparedStatement.setString(3, Student.getYear_of_receipt());
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }

    public static int update(Student Student) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)){

                String sql = "UPDATE Students SET Full_name = ?, Year_of_receipt = ? WHERE Cod_Student = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setString(1, Student.getFull_name());
                    preparedStatement.setString(2, Student.getYear_of_receipt());
                    preparedStatement.setInt(3, Student.getCod_Student());

                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
    public static int delete(int Cod_student) {

        try{
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(URL, USER, PASS)){

                String sql = "UPDATE Students SET isdellete = `false` WHERE Cod_student = ?";
                try(PreparedStatement preparedStatement = conn.prepareStatement(sql)){
                    preparedStatement.setInt(1, Cod_student);
                    return  preparedStatement.executeUpdate();
                }
            }
        }
        catch(Exception ex){
            System.out.println(ex);
        }
        return 0;
    }
}