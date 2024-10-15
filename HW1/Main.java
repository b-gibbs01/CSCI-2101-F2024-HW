package HW1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start of Main");
        var Tale="";
        Tale=Adlibs.story("Ragnar", 20, "Red");
        System.out.println(Tale);

        System.out.println();

        Pyramid.Output();

        System.out.println();

        var Zemons ="";
        Zemons=Replace.charReplace("Lemonade",0,'Z');
        System.out.println(Zemons);
    }
}
