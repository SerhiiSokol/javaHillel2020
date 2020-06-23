import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/student?useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "S@mposebe1";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        System.out.println("------------------------------------------------------");
        allStudent();
        System.out.println("------------------------------------------------------");
        oneGroupSet(2);
        System.out.println("------------------------------------------------------");
        oneYar(2012);
        System.out.println("------------------------------------------------------");
        gradeOfStudent("Lacy Kinney");
        System.out.println("------------------------------------------------------");
        averGrade("Lacy Kinney");
    }

    public static Connection con() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USER, PASS);
    }

    public static void oneGroupSet(int group) throws SQLException {
        String requestSQL = """
                select students.Cod_student,Full_name,students.`group`,Year_of_receipt
                                from student.students 
                                left join `groups` 
                                on `groups`.Cod_Groups = students.`group`
                                where `groups`.`group` = ?""";
        PreparedStatement preStatement = null;
        try {
            preStatement = con().prepareStatement(requestSQL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert preStatement != null;
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

    public static void allStudent() throws SQLException, ClassNotFoundException {
        ResultSet rs = con().createStatement().executeQuery("select * from students");
        List<AllStudent> allStudents = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("Cod_student");
            String fn = rs.getString("Full_name");
            int gr = rs.getInt("group");
            String yar = rs.getString("Year_of_receipt");

            allStudents.add(new AllStudent(id, fn, gr, yar));
        }
        for (AllStudent allStudent : allStudents) {
            System.out.println(allStudent.toString());
        }
    }

    public static void oneYar(int yar) throws SQLException {
        String requestSQL = """
                select students.Cod_student,Full_name,`groups`.`group`,Year_of_receipt
                from student.students 
                left join `groups` 
                on `groups`.Cod_Groups = students.`group`
                where year(students.Year_of_receipt)  = ?""";

        PreparedStatement preStatement = null;
        try {
            preStatement = con().prepareStatement(requestSQL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert preStatement != null;
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

    public static void gradeOfStudent(String name) throws SQLException {
        String requestSQL = """
                select students.Cod_student, students.Full_name, `groups`.`group`, grade.Grade,lessons.Name ,teachers.Full_name 
                from students
                left join `groups` on `groups`.Cod_Groups = students.`group`
                left join grade on grade = students.Cod_student\s
                left join lessons on  grade.Lesson = lessons.Cod_Lessons
                left join teachers on lessons.Teacher = teachers.Cod_teacher where students.Full_name = ?;""";

        PreparedStatement preStatement = null;
        try {
            preStatement = con().prepareStatement(requestSQL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert preStatement != null;
        preStatement.setString(1, name);
        ResultSet rs = preStatement.executeQuery();
        while (rs.next()) {
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            String group = rs.getString("group");
            String Grade = rs.getString("Grade");
            String lesson = rs.getString("Name");
            String teacher = rs.getString("Full_name");
            System.out.print("Id ->> %d Full name ->> %s Group ->> %s Ball ->> %s Lesson ->> %s Teacher ->> %s".formatted(Cod_student, Full_name, group, Grade, lesson, teacher));
            System.out.println();
        }


    }

    public static void averGrade(String name) throws SQLException {
        String requestSQL = """
                select students.Cod_student,
                    Full_name,
                `groups`.`group`,
                avg(grade.Grade) as Grade,Year_of_receipt
                from student.students
                left join `groups` on `groups`.Cod_Groups = students.`group`
                left join grade on grade = students.Cod_student
                where students.Full_name = ?;""";

        PreparedStatement preStatement = null;
        try {
            preStatement = con().prepareStatement(requestSQL);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert preStatement != null;
        preStatement.setString(1, name);
        ResultSet rs = preStatement.executeQuery();
        while (rs.next()) {
            int Cod_student = rs.getInt("Cod_student");
            String Full_name = rs.getString("Full_name");
            String group = rs.getString("group");
            String Grade = rs.getString("Grade");
            System.out.print("Id ->> %d Full name ->> %s Group ->> %s Average Ball ->> %s ".formatted(Cod_student, Full_name, group, Grade));
            System.out.println();
        }

    }

}
