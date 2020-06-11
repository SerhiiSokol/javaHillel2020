import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Student {
    private int id;
    private String fn;
    private int gr;
    private String yar;

    public Student(int id, String fn, int gr, String yar) {
        this.id = id;
        this.fn = fn;
        this.gr = gr;
        this.yar = yar;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", fn = '" + fn + '\'' +
                ", gr = " + gr +
                ", yar = '" + yar + '\'' +
                '}';
    }
}