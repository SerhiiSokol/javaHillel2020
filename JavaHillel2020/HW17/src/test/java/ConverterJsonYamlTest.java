import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
public class ConverterJsonYamlTest {

    @Test
    public void toJson() throws IOException {
        Object json = new YAMLMapper().readValue(new FileReader("HW17\\src\\main\\resources\\myPerson.yaml"), Object.class);
             //   assert
    }

    @Test
    public void toYaml() {
    }
}