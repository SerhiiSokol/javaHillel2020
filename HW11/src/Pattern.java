
public class Pattern{
    public static void main(String[] args) {
        Pattern test = new Pattern();
        String data = "HILLEL2020";
        System.out.println((test.jdk14(data)));
    }
    public String jdk14(Object data) {
        if (data instanceof String knownType) {
            return knownType.toLowerCase();
        }

        return null;
    }

}