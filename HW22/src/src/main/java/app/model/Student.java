package app.model;

public class Student{
    private int Cod_Student;
    private String Full_name;
    private int group;
    private String Year_of_receipt;
    private boolean isdelleted;

    public Student(){ }

    public Student(String full_name, int group, String year_of_receipt) {
        Full_name = full_name;
        this.group = group;
        Year_of_receipt = year_of_receipt;
    }

    public Student(int cod_Student) {
        Cod_Student = cod_Student;
    }

    public Student(int cod_Student, String full_name, int group, String year_of_receipt, boolean isdelleted) {
        Cod_Student = cod_Student;
        Full_name = full_name;
        this.group = group;
        Year_of_receipt = year_of_receipt;
        this.isdelleted = isdelleted;
    }

    public void setCod_Student(int cod_Student) {
        Cod_Student = cod_Student;
    }

    public void setFull_name(String full_name) {
        Full_name = full_name;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setYear_of_receipt(String year_of_receipt) {
        Year_of_receipt = year_of_receipt;
    }

    public void setIsdelleted(boolean isdelleted) {
        this.isdelleted = isdelleted;
    }

    public String getFull_name() {
        return Full_name;
    }

    public String getYear_of_receipt() {
        return Year_of_receipt;
    }

    public boolean isIsdelleted() {
        return isdelleted;
    }

    public int getCod_Student() {
        return Cod_Student;
    }

    @Override
    public String toString() {
        return "app.model.Student{" +
                "Cod_Student=" + Cod_Student +
                ", Full_name='" + Full_name + '\'' +
                ", group=" + group +
                ", Year_of_receipt='" + Year_of_receipt + '\'' +
                ", isdelleted=" + isdelleted +
                '}';
    }
}