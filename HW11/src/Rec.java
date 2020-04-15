public record Rec(int a,String str,boolean b){
    public Rec {
    }
}
class TestRec{
    public static void main(String[] args) {
        Rec r = new Rec(2020,"Java Hillel",true);
        System.out.println(r.toString());
    }

}