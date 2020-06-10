
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ConverterJsonYaml {
    public static void main(String[] args) throws IOException {
        toJson(ConverterJsonYaml.startTest());
        toYaml();
    }

    public static void toJson(String patch) throws IOException {
        //создаем обьект и присваиваем ему значение мапы файла yaml
        System.out.println("Читаю YAML");
        Object json = new YAMLMapper().readValue(new FileReader(patch), Object.class);
        //создаем файл и записываем в него значение мапы мапу json
        System.out.println("Создаю и записываю JSON");
        new JsonMapper().writerWithDefaultPrettyPrinter().writeValue(new File(
                "C:\\Users\\sokol\\IdeaProjects\\JavaHillel2020\\JavaHillel2020\\HW17\\src\\main\\resources\\myPerson.json"), json);
    }

    public static void toYaml() throws IOException {
        //создаем json node и присваиваем ей значение мапы файла yaml
        System.out.println("Читаю JSON");
        JsonNode jsNode = new JsonMapper().readTree(new FileReader(
                "C:\\Users\\sokol\\IdeaProjects\\JavaHillel2020\\JavaHillel2020\\HW17\\src\\main\\resources\\myPerson.json"));
        //текстовой переменной присваиваем значение мапы json node
        String yaml = new YAMLMapper().writeValueAsString(jsNode);
        //Записываем в файл полученое значение текстовой переменной
        System.out.println("Создаю и записываю YAML");
        FileWriter writer = new FileWriter(
                "C:\\Users\\sokol\\IdeaProjects\\JavaHillel2020\\JavaHillel2020\\HW17\\src\\main\\resources\\myPerson2.yaml");
        writer.write((yaml).replaceAll("\"", ""));
        writer.flush();
    }

    static String startTest() {
        System.out.println("Укажите полный путь вместе именем конвертируемого файла пример:(C:\\\\myPerson.yaml)");
        Scanner sc = new Scanner(System.in);
        String patch = sc.nextLine();
        try {
            new YAMLMapper().readValue(new FileReader(patch), Object.class);
        } catch (Exception e) {
            System.out.println("Неверный путь или имя файла");
            startTest();
        }return patch;
    }
}






