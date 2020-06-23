import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OneGroup {
    int Cod_student;
    String Full_name;
    String group;
    String Year_of_receipt;

    public OneGroup(int cod_student, String full_name, String group, String year_of_receipt) {
        Cod_student = cod_student;
        Full_name = full_name;
        this.group = group;
        Year_of_receipt = year_of_receipt;
    }

    @Override
    public String toString() {
        return "OneGroup{" +
                "Cod_student=" + Cod_student +
                ", Full_name='" + Full_name + '\'' +
                ", group='" + group + '\'' +
                ", Year_of_receipt='" + Year_of_receipt + '\'' +
                '}';
    }
}