import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AllStudent {
    private final int id;
    private final String fn;
    private final int gr;
    private final String yar;

    public AllStudent(int id, String fn, int gr, String yar) {
        this.id = id;
        this.fn = fn;
        this.gr = gr;
        this.yar = yar;
    }
    @Override
    public String toString() {
        return "AllStudent{" +
                "id_student = " + id +
                ", Full_name = '" + fn + '\'' +
                ", Group = " + gr +
                ", Year_of_receipt = '" + yar + '\'' +
                '}';
    }
}