import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "S@mposebe1";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(URL, USER, PASS);
        System.out.println("------------------------------------------------------");
        allStudent(connection);
        System.out.println("------------------------------------------------------");
        oneGroupSet(2, connection);
        System.out.println("------------------------------------------------------");
        oneYar(2012, connection);
        System.out.println("------------------------------------------------------");
        gradeOfStudent("Lacy Kinney", connection);
        System.out.println("------------------------------------------------------");
        averGrade("Lacy Kinney", connection);
    }

    public static void oneGroupSet(int group, Connection connection_receip) throws SQLException {
        String requestSQL = """
                select students.Cod_student,students.`group`,Full_name,Year_of_receipt
                                from student.students left join `groups` on `groups`.Cod_Groups = students.`group`
                                where `groups`.`group` = ?""";
        PreparedStatement preStatement = connection_receip.prepareStatement(requestSQL);
        preStatement.setInt(1, group);
        ResultSet rs = preStatement.executeQuery();
        while (rs.next()) {
            List<OneGroup> oneGroups = new ArrayList<>();
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            String groups = rs.getString("group");
            String Year_of_receipt = rs.getString("Year_of_receipt");
            oneGroups.add(new OneGroup(Cod_student, Full_name, groups, Year_of_receipt));
            for (OneGroup one : oneGroups) {
                System.out.println(one);
            }
        }
    }

    public static void allStudent(Connection connection_receip) throws SQLException {
        ResultSet rs = connection_receip.createStatement().executeQuery("select * from students");
        List<AllStudent> allStudents = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("Cod_student");
            String fn = rs.getString("Full_name");
            int gr = rs.getInt("group");
            String yar = rs.getString("Year_of_receipt");

            allStudents.add(new AllStudent(id, fn, gr, yar));
        }
        for (AllStudent allStudent : allStudents) {
            System.out.println(allStudent);
        }
    }

    public static void oneYar(int yar, Connection connection_receip) throws SQLException {
        String requestSQL = """
                select students.Cod_student,Full_name,`groups`.`group`,Year_of_receipt
                from student.students left join `groups` on `groups`.Cod_Groups = students.`group`
                where year(students.Year_of_receipt)  = ?""";

        PreparedStatement preStatement = connection_receip.prepareStatement(requestSQL);
        preStatement.setString(1, String.valueOf(yar));
        ResultSet rs = preStatement.executeQuery();
        List<OneYar> oneYars = new ArrayList<>();
        while (rs.next()) {
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            int group = rs.getInt("group");
            String Year_of_receipt = rs.getString("Year_of_receipt");
            oneYars.add(new OneYar(Cod_student, Full_name, group, Year_of_receipt));
        }
        for (OneYar oneY : oneYars) {
            System.out.println(oneY);
        }
    }
    public static void gradeOfStudent(String name, Connection connection_receip) throws SQLException {
        String requestSQL = """
                select students.Cod_student as Cod_student, students.Full_name as Full_name, `groups`.`group` as `group`, grade.Grade\s
                as Grade,lessons.Name as Lesson,teachers.Full_name as Teacher from students\s
                left join `groups` on `groups`.Cod_Groups = students.`group`
                left join grade on grade.Student = students.Cod_student\s
                left join lessons on  grade.Lesson = lessons.Cod_Lessons
                left join teachers on lessons.Teacher = teachers.Cod_teacher where students.Full_name = ?;""";

        PreparedStatement preStatement = connection_receip.prepareStatement(requestSQL);
        preStatement.setString(1, name);
        ResultSet rs = preStatement.executeQuery();
        while (rs.next()) {
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            String group = rs.getString("group");
            String Grade = rs.getString("Grade");
            String lesson = rs.getString("Lesson");
            String teacher = rs.getString("Teacher");
            System.out.print("Id ->> %d Full name ->> %s Group ->> %s Ball ->> %s Lesson ->> %s Teacher ->> %s".formatted(Cod_student, Full_name, group, Grade, lesson, teacher));
            System.out.println();
        }

    }

    public static void averGrade(String name, Connection connection_receip) throws SQLException {
        String requestSQL = """
                select students.Cod_student,
                    Full_name,
                `groups`.`group`,
                avg(grade.Grade) as Grade,Year_of_receipt
                from student.students
                left join `groups` on `groups`.Cod_Groups = students.`group`
                left join grade on grade.Student = students.Cod_student
                where students.Full_name = ?;""";

        PreparedStatement preStatement = connection_receip.prepareStatement(requestSQL);
        preStatement.setString(1, name);
        ResultSet rs = preStatement.executeQuery();
        while (rs.next()) {
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            String group = rs.getString("group");
            String Grade = rs.getString("Grade");
            String Year_of_receipt = rs.getString("Year_of_receipt");
            System.out.print("Id ->> %d Full name ->> %s Group ->> %s Average Ball ->> %s Year_of_receipt->> %s".formatted(Cod_student, Full_name, group, Grade, Year_of_receipt));
            System.out.println();
        }

    }

}
