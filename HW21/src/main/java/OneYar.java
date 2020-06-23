import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OneYar {
    int Cod_student;
    String Full_name;
    int group;
    String Year_of_receipt;

    public OneYar(int cod_student, String full_name, int group, String year_of_receipt) {
        Cod_student = cod_student;
        Full_name = full_name;
        this.group = group;
        Year_of_receipt = year_of_receipt;
    }

    @Override
    public String toString() {
        return "OneYar{" +
                "Cod_student=" + Cod_student +
                ", Full_name='" + Full_name + '\'' +
                ", group='" + group + '\'' +
                ", Year_of_receipt='" + Year_of_receipt + '\'' +
                '}';
    }
}