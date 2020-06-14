
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ConverterJsonYaml {
    public static void main(String[] args) {


        getStarted();

    }

    static void getStarted() {
        System.out.println("Welcome to JSON/YAML converter!");
        System.out.println("In next line plz input patch to your file.");
        Scanner sc = new Scanner(System.in);
        String rout = sc.nextLine();

        System.out.println("Very good! And enter FULL name(with format) your file to be converted.");

        String name = sc.nextLine().toLowerCase();
        String path = rout + "\\" + name;
        File f = new File(path);
        if (!f.exists()) {
            System.out.println("Incorrect path and / or file name, try again");
            getStarted();
        }
        if (getFileExtension(f).equals("json")) {
            try {
                toYaml(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (getFileExtension(f).equals("yaml")) {
            try {
                toJson(path);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Invalid file format, the program accepts only json / yaml files. Try to check and repeat everything.");
            getStarted();
        }

    }

    public static void toJson(String path) throws IOException {
        //создаем обьект и присваиваем ему значение мапы файла yaml
        System.out.println("Read YAML");
        Object json = new YAMLMapper().readValue(new FileReader(path), Object.class);
        //создаем файл и записываем в него значение мапы мапу json
        System.out.println("I create and record JSON");
        new JsonMapper().writerWithDefaultPrettyPrinter().writeValue(new File(path + "_Converted_to.json"), json);
        System.out.println("it`s over! Good day!");
    }

    public static void toYaml(String path) throws IOException {
        //создаем json node и присваиваем ей значение мапы файла yaml
        System.out.println("Read json");
        JsonNode jsNode = new JsonMapper().readTree(new FileReader(path));
        //текстовой переменной присваиваем значение мапы json node
        String yaml = new YAMLMapper().writeValueAsString(jsNode);
        //Записываем в файл полученое значение текстовой переменной
        System.out.println("I create and record YAM");
        FileWriter writer = new FileWriter(
                path + "_Converted_to.yaml");
        writer.write((yaml).replaceAll("\"", ""));
        writer.flush();
        System.out.println("it`s over! Good day!");
    }

    private static String getFileExtension(File file) {
 return file.getName().substring(file.getName().lastIndexOf(".") + 1);
    }
}






